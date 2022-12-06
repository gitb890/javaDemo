package AcWing;

import java.util.Scanner;

/**
 * 读取两个整数 A 和 B，表示游戏的开始时间和结束时间，以小时为单位。
 *
 * 然后请你计算游戏的持续时间，已知游戏可以在一天开始并在另一天结束，最长持续时间为 24 小时。
 *
 * 如果 A 与 B 相等，则视为持续了 24 小时。
 *
 * 输入格式
 * 共一行，包含两个整数 A 和 B。
 *
 * 输出格式
 * 输出格式为 O JOGO DUROU X HORA(S)，其中 X 为游戏持续时间。
 *
 * 数据范围
 * 0≤A,B≤23
 * */

public class step9 {
    public static void main(String[] args) {
        int A,B;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();

        int X = 0;
        if (A == B){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if (A > B){
            X = (24-A)+B;
            System.out.println("O JOGO DUROU "+X+" HORA(S)");
        } else if (A < B) {
            X = B-A;
            System.out.println("O JOGO DUROU "+X+" HORA(S)");
        }
    }
}
