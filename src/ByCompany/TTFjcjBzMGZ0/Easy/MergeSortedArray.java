package ByCompany.TTFjcjBzMGZ0.Easy;

import java.util.Arrays;

public class MergeSortedArray {
    void merge(int[] A, int m, int[] B, int n) {
        int i = m -1;
        int j = n -1;
        int k = m+n -1;
        while( i >=0 && j >=0 ) {
            if(A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
        while(j >=0) {
            A[k--] = B[j--];
        }

    }

    public static void main(String[] args) {
        int a[] = new int[]{ 1,2,3,0,0,0 };
        new MergeSortedArray().merge(a, 3, new int[] {2,5,6}, 3);
        System.out.println(Arrays.toString(a));
    }
}
