
#include <stdio.h>
//#define MAX 7
//    int A[] = {1, 2, 3, 9, 4, 5, 6};
//#define MAX 8
//    int A[] = {9, 5, 6, 3, 9, 6, 4, 7};
#define MAX 7
    int A[] = {8, 3, 4, 2, 6, 9, 1};
//#define MAX 15
//  int A[] = {1,5,3,10,4,20,5,30,10,10,10,10,30,20,25};
	int maior[MAX]={0};
  	int maiorPos;
  
  	void verificaMaior(int s[], int posSol) {
        if (posSol > maiorPos) {
            register int i = 0;
			for (; i < MAX; i++) {
                maior[i] = s[i];
            }
            maiorPos = posSol;
        }
    }
 
	 void subsequenciaMaxima(int s[], int pos, int posSol, int i) {
        register int j = pos;
		for (; j < MAX; j++) {
            if (i <= A[j]) {
                s[posSol] = A[j];
                subsequenciaMaxima(s, j + 1, posSol + 1, A[j]);
            } else {
                verificaMaior(s, posSol);
            }
        }
        verificaMaior(s, posSol);
    }

	void print(int v[], int lastPos) {
        register int i = 0;
		for (i; i < lastPos; i++) {
            printf("%d ",+v[i]);
        }
        printf("\n");
    }

    
     int main(void) {
  		int s[MAX]={0};
  		register int i=0;
        maiorPos = 0;
        subsequenciaMaxima(s, 0, 0, 0);
        print(maior, maiorPos);
    return 0;
	}



