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
    private static final int A[] = {1, 2, 3, 9, 4, 5, 6};

    public static void main(String[] args) {
        int s[] = new int[A.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = 0;
        }
        subsequenciaMaxima(0, 0, s);
    }

    public static void subsequenciaMaxima(int pos, int posSol, int s[]) {
        if (posSol == 0) {
            s[posSol++] = A[pos];
            pos++;
        } else if (s[posSol - 1] < A[pos]) {
            s[posSol++] = A[pos++];
        } else {
            if (pos < A.length) {
                subsequenciaMaxima(pos, posSol - 1, s);
                s[posSol-1] = A[pos-1];
            }
        }
        if (pos < A.length) {
            subsequenciaMaxima(pos, posSol, s);
        } else {
            print(s);
        }
    }

    public static void print(int[] v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
