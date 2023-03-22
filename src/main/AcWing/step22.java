package AcWing;

import java.util.Scanner;

public class step22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)){
                //判断输入字符
                System.out.println(c);
                return;
            }
        }
        System.out.println("no");
    }
}
