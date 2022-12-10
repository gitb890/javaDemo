package AcWing;

import java.util.Scanner;

public class step12 {
    public static void main(String[] args) {
        Double n;
        Scanner in = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i <6; i++) {
            n = in.nextDouble();
            if (n>0){
                count++;
            }
        }
        System.out.println(count+" positive numbers");
    }
}
