package AcWing;

import java.util.Scanner;

public class step28 {
     public static int gcb(int a,int b){
        if (b==0) {
            return a;
        }else {
            return gcb(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(gcb(a,b));
    }
}
