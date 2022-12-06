package AcWing;

import java.util.Scanner;

/**乘积*/
public class step2 {
    public static void main(String[] args) {
        int A,B,C,D;
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();
        int DIFERENCA = (A*B-C*D);
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
}
