package AcWing;

import java.util.Scanner;


/**
 * 给定你三个葡萄牙语单词，这些词将根据下表从左到右定义一个动物。
 *
 * 请你确定并输出这个动物的名称。
 * */
public class step10 {
    public static void main(String[] args) {
        String A,B,C;
        Scanner in = new Scanner(System.in);
        A = in.next();
        B = in.next();
        C = in.next();

        String D = "vertebrado",E = "invertebrado";
        String a = "ave",b = "mamifero",c = "inseto",d = "anelideo";
        String e = "carnivoro",f = "onivoro",g = "herbivoro",h = "hematofago";
        if (A.equals(D) && B.equals(a) && C.equals(e)){
            System.out.println("aguia");
        }else if (A.equals(D) && B.equals(a) && C.equals(f)){
            System.out.println("pomba");
        } else if (A.equals(D) && B.equals(b) && C.equals(f)){
            System.out.println("homem");
        }else if (A.equals(D) && B.equals(b) && C.equals(g)){
            System.out.println("vaca");
        } else if (A.equals(E) && B.equals(c) && C.equals(h)) {
            System.out.println("pulga");
        } else if (A.equals(E) && B.equals(c) && C.equals(g)) {
            System.out.println("lagarta");
        } else if (A.equals(E) && B.equals(d) && C.equals(h)) {
            System.out.println("sanguessuga");
        }else if (A.equals(E) && B.equals(d) && C.equals(f)){
            System.out.println("minhoca");
        }
    }
}
