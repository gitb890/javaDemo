package AcWing;

import java.util.Scanner;

public class step29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

//        sort(a,l,r);
        select_sort(a,l,r);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",a[i]);
        }
    }

    private static void sort(int a[],int l,int r){
        for (int i = r; i < l; i++) {
            for (int j = l; j < i; j++) {
                if (a[i]>a[i+1]){
                    int count = a[j];
                    a[j] = a[j+1];
                    a[j+1] = count;
                }
            }
        }
    }

    private static void select_sort(int a[],int l,int r){
        for (int i = 0; i < r; i++) {
            for (int j = l; j < r; j++) {
                if (a[i]>a[i+1]){
                    int count = a[j];
                    a[j] = a[j+1];
                    a[j+1] = count;
                }
            }
        }
    }
}
