package AcWing;

import java.util.Scanner;

import static java.lang.Math.abs;


/**
 * 输入一个奇数 n，输出一个由 * 构成的 n 阶实心菱形。
 *
 * 输入格式
 * 一个奇数 n。
 *
 * 输出格式
 * 输出一个由 * 构成的 n 阶实心菱形。
 *
 * 具体格式参照输出样例。
 *
 * 数据范围
 * 1≤n≤99
 * */
public class step15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        int sx = x / 2,sy = x / 2;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (Math.abs(i-sx)+Math.abs(j-sy)<= x / 2){
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
