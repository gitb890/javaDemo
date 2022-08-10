package AcWing;

import java.util.Scanner;

/**钞票*/
public class step4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] moeny = {100,50,20,10,5,2,1};
        System.out.println(n);
        for (int x : moeny){
            System.out.printf("%d nota(s) de R$ %d,00\n",n/x,x);
            n %=x;
        }
    }
}
