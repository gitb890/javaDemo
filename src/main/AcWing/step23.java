package AcWing;

import java.util.Scanner;

public class step23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strs = in.nextLine();
        String str1 = in.next();
        String str2 = in.next();

        System.out.printf(strs.replaceAll("\\b"+str1+"\\b",str2));
        //replaceAll里面用的是正则表达式，所以字符串转义一次，正则转义一次

    }
}
