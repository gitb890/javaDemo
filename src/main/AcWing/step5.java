package AcWing;

import java.util.Scanner;

/**时间转换*/
public class step5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int hours = n/3600;
        int minutes = n%3600/60;
        int secends = n%60;
        System.out.println(hours+":"+minutes+":"+secends);
    }
}
