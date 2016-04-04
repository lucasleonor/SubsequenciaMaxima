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
    private static final int A[] = {8, 5, 4, 2, 6, 9, 7};

    public static void main(String[] args) {
        int s[] = new int[A.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = 0;
        }
        subsequenciaMaxima(0, 0, s, 0);
    }

<<<<<<< HEAD
    public static void subsequenciaMaxima(int pos, int posSol, int s[], int i) {
        int n = 0, posAux;
        do {
            posAux = next(A, n, pos);
            if (posAux != -1) {
                pos = posAux;
                s[posSol++] = A[pos];
                n = A[pos];
            } else if (pos < A.length) {
                print(s, posSol);
                subsequenciaMaxima(++pos, posSol - 1, s, i);
                pos = -1;
            }else{
                break;
            }
        } while (pos != -1);
=======
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
>>>>>>> origin/master
    }

    public static void print(int[] v, int lastPos) {
        for (int i = 0; i < lastPos; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static int next(int[] v, int n, int pos) {
        for (int i = pos; i < v.length; i++) {
            if (v[i] > n)
                return i;
        }
        return -1;
    }

}
