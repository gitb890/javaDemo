package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
//输出，效率较高，输出规模较大时使用。注意需要抛异常。
public class demo_out {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World\n");
        bw.flush();
    }
}
