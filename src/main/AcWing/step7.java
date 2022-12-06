package AcWing;

import java.util.Scanner;


/**
 * 某商店出售 5 种零食，零食编号为 1∼5。
 *
 * 5 种零食的价目表如下所示：
 *
 * 零食种类        价格
 * 零食  1         R$ 4.00
 * 零食  2         R$ 4.50
 * 零食  3         R$ 5.00
 * 零食  4         R$ 2.00
 * 零食  5         R$ 1.50
 * 现在给定某种零食的编号和数量，请你计算总价值是多少。
 * */
public class step7 {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();

        double Total = 0.d;
        switch (x){
            case 1:
                Total = 4.0*y;
                break;
            case 2:
                Total = 4.50d*y;
                break;
            case 3:
                Total = 5.0d*y;
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
