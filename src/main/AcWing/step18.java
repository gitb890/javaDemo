package AcWing;

import java.util.Scanner;

import static java.lang.Math.min;

public class step18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//        if (N == 0){
//            return;
//        }
//
//        for (int i = 1; i < N; i++) {
//            for (int j = 1;i < N;j++){
////                int[][] res = new int[i][j];
//                System.out.printf("%d",min(min(i,j), min(N-i+1,N-j+1)));
//            }
//            System.out.printf("\n");
//        }
//        System.out.printf("\n");
        while(true){
            int N = in.nextInt();
            if (N == 0){
                break;
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    int up = i,down = N-i+1,left = j,right = N-j+1;
                    System.out.printf("%d ",min(min(up,down),min(left,right)));
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
