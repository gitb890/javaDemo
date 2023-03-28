package AcWing;

import java.util.Scanner;

public class step25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            int N = in.nextInt();
            if (N == 0) break;//当n输入为0时退出

            String[] strs = new String[N];
            for (int i = 0; i < N; i++) {
                strs[i] = in.next();
            }

            StringBuilder s = new StringBuilder();
            for (int i = 1; i <= strs[0].length(); i++) {
                boolean p = true;
                char c = strs[0].charAt(strs[0].length() - i);
                for (int j = 1;j < N;j++){
                    if (i > strs[j].length() || strs[j].charAt(strs[j].length() - i) != c){
                        //如果长度超了或者是不相同判断
                        p = false;
                        break;
                    }
                }

                if (p=true) s.append(c);
                else break;
            }
            s.reverse();
            System.out.println(s);
        }
    }
}
