package AcWing;

import java.util.Scanner;

public class step20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] ans = new int[n][m];
        int[] dx = {-1,0,1,0},dy={0,1,0,-1};
        int x =0,y = 0,d = 1;
        for (int i = 1; i <= n*m; i++) {
            ans[x][y] = i;
            int a = x+dx[d],b = y+dy[d];
            if (a < 0 || a>=n || b < 0||b >= m || ans[a][b] > 0){
                d = (d+1) % 4;
//                换方向
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ",ans[i][j]);
            }
            System.out.println();
        }
    }
}
