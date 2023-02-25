package AcWing;

import java.util.Scanner;

/**
 * 数组中的行
 * */
public class step17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
//        op用于读取下一步操作
        String op = in.next();

        double[][] h = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                h[i][j] = in.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += h[l][i];
        }
        if (op.equals("M")){
            sum /=12;
        }
        System.out.printf("%.1f",sum);
    }
}
