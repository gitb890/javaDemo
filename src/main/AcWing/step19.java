package AcWing;

import java.util.Scanner;

public class step19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans = in.next();
        double[][] sc = new double[12][12];
//        定义12x12的二维数组，获取输入的二维数组值
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                sc[i][j] = in.nextDouble();
            }
        }
//        定义总数和计算平均值
        double sum = 0,anc = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10 - i; j++) {
                sum += sc[i][j];
                anc += 1;
            }
        }
            if (ans.equals("M")) {
                sum /= anc;
            }
            System.out.printf("%.1f\n",sum);
    }
}
