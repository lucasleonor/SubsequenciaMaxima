/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsequenciamaxima;

/**
 *
 * @author 31471730
 */
public class SubsequenciaMaxima {

    /**
     * @param args the command line arguments
     */
//    private static final int A[] = {1, 2, 3, 9, 4, 5, 6};
//    private static final int A[] = {9, 5, 6, 3, 9, 6, 4, 7};
//    private static final int A[] = {8, 3, 4, 2, 6, 9, 1};
    private static final int A[] = {1,5,3,10,4,20,5,30,10,10,10,10,30,20,25};
    private static int maior[], maiorPos;

    public static void main(String[] args) {
        maior = new int[A.length];
        maiorPos = 0;
        int s[] = new int[A.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = 0;
        }
        subsequenciaMaxima(s, 0, 0, 0);
        print(maior, maiorPos);
    }

    public static void subsequenciaMaxima(int s[], int pos, int posSol, int i) {
        for (int j = pos; j < A.length; j++) {
            if (i <= A[j]) {
                s[posSol] = A[j];
                subsequenciaMaxima(s, j + 1, posSol + 1, A[j]);
            } else {
                verificaMaior(s, posSol);
            }
        }
        verificaMaior(s, posSol);
    }

    public static void print(int[] v, int lastPos) {
        for (int i = 0; i < lastPos; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    private static void verificaMaior(int[] s, int posSol) {
        if (posSol > maiorPos) {
            for (int i = 0; i < s.length; i++) {
                maior[i] = s[i];
            }
            maiorPos = posSol;
        }
    }

}
