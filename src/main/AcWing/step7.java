package AcWing;

import java.util.Scanner;

public class step7 {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();

        double Total = 0.d;
        switch (x){
            case 1:
                Total = 4.0*y*100;
                break;
            case 2:
                Total = 4.50d*y*100;
                break;
            case 3:
                Total = 5.0d*y*100;
                break;
            case 4:
                Total = 2.0d*y;
                break;
            case 5:
                Total = 1.50d*y;
                break;
            default:
                System.out.println("not this cookies");
        }
        System.out.println("Total: R$ "+String.format("%.2f",Total));
    }
}
