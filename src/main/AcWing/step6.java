package AcWing;

import java.util.Scanner;

//倍数  读取两个正整数值 A 和 B。
//
//如果其中一个是另一个的整数倍，则输出 Sao Multiplos，否则输出 Nao sao Multiplos
public class step6 {

    public static void main(String[] args) {
        int A,B;
        Scanner in1 = new Scanner((System.in));
        Scanner in2 = new Scanner(System.in);
        A = in1.nextInt();
        B = in2.nextInt();

        if (A%B==0 || B%A==0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
