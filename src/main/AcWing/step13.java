package AcWing;

import java.util.Scanner;

public class step13 {
    public static void main(String[] args) {
//        int a,b,c,d;
//        Scanner in = new Scanner(System.in);
//
//        int count = 0;
//        a = in.nextInt();
//        b = in.nextInt();
//        c = in.nextInt();
//        d = in.nextInt();
//        if (a > 0){
//            for (int i = 1; i <= a; i++) {
//                a = count++;
//                System.out.print(i+" ");
//            }
//        }
//        if (b>0){
//            for (int j = 1; j <= b; j++) {
//                b = count++;
//                System.out.print(j+" ");
//            }
//        }
//        if (c>0){
//            for (int k = 1; k <= c; k++) {
//                c = count++;
//                System.out.print(k+" ");
//            }
//        }
//        if (d>0){
//            for (int l = 1; l <= d; l++) {
//                d = count++;
//                System.out.print(l+" ");
//            }
//        }else {
//            System.out.println("");;
//        }
//    }
        int x;
        Scanner in = new Scanner(System.in);

        while ((x = in.nextInt())>0){
            for (int i = 1;i<=x;i++){
                System.out.print(i + " ");
            }
            System.out.print("");
        }
    }
}
