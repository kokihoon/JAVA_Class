import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class W08P02 {
    public static void main(String[] args) {

            line_count(args[0]);
            token_count(args[0]);
            char_count(args[0]);
    }
    private static void char_count(String str) {
        try {
            int char_num = 0;
            FileReader r = new FileReader(str);
            while(true) {
                int data = r.read();

                if(data == -1) break;
                char_num += 1;
            }
            System.out.println("문자 수: " +char_num);
        }catch (Exception e) {}
    }
    private static void token_count(String str) {
        try {
            FileReader r = new FileReader(str);
            BufferedReader br = new BufferedReader(r);
            int token_num = 0;
            while(true) {
                String line = br.readLine();
                if(line == null) break;
                String tokens[] = line.split("\\s+");

                for(String v : tokens) {
                    token_num += 1;
                }


            }
            System.out.println("토큰 수: "+token_num);

        }catch (Exception e) {}
    }
    private static void line_count(String str) {
        try {
            FileReader r = new FileReader(str);
            BufferedReader br = new BufferedReader(r);
            int line_num = 0;
            while(true) {
                String line = br.readLine();
                if(line == null) break;
                line_num += 1;
            }
            System.out.println("라인 수: "+line_num);
        } catch (Exception e) {}
    }
}
