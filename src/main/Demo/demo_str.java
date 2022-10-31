package Demo;

public class demo_str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++) {
//            将前面的字符串字母在ACSII表的位数+2输出
            sb.setCharAt(i,(char) (sb.charAt(i)+2));
        }
        System.out.println(sb);
    }
}
