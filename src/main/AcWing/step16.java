package AcWing;

import java.util.Scanner;

public class step16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        长度为10的数组
        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
            if (x[i] <= 0) {
                x[i] = 1;
            }
        }
            for (int j = 0; j < x.length; j++) {
                System.out.printf("X[%d] = %d\n", j, x[j]);
            }

        }
}
