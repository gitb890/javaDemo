package AcWing;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class step30 {
    private static int[] path;//存储遍历得到的数
    private static boolean st[];//判断数字是否遍历
    private static int n;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//获取输出的数字

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        path = new int[n];
        st = new boolean[n];

        sort_dfs(0);
        bw.flush();//刷新缓存
    }

//    采用dfs深度搜索方式;递归搜索树
    private static void sort_dfs(int b) throws IOException {
        if (b == n){
            for (int i = 0; i < n; i++) {
                bw.write(path[i]+" ");//获取每个输出的数字以空格间隔
            }
            bw.write("\n");//回车后输出
        }else {
            for (int i = 0; i < n; i++) {
                if (!st[i]){//当这个数字不存在于q[]数组中,可以进入，否则继续遍历
                    st[i] = true;//判断数字
                    path[b]= i+1;//存入数字
                    sort_dfs(b+1);//进入下一层树
                    st[i] = false;//从下一层结束时，该数字不再遍历
                }
            }
        }
    }
}
