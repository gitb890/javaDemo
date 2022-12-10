package AcWing;

import java.util.Scanner;

public class step14 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        for (int i = 1; i <= x ; i++) {
            if (x % i == 0){
                System.out.println(i+" ");
            }
        }
    }
}
