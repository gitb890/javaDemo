package AcWing;

import java.util.Scanner;

public class step24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] a = str.split(" ");
        //将单词用空格分隔出来
        for (int i = a.length -1; i >= 0; i--) {
            System.out.printf(a[i]+" ");
        }
    }
}
