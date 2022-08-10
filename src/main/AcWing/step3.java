package AcWing;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**两点间的距离*/
public class step3 {
    public static void main(String[] args) {
        double p1,p2,x1,y1;
        Scanner in = new Scanner(System.in);
        p1 = in.nextDouble();
        p2 = in.nextDouble();
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        float distance = (float) sqrt(pow(x1-p1,2)+pow(y1-p2,2));
        distance = Math.round(distance*10000)/10000f;
        System.out.println(distance);
    }
}
