import java.io.FileInputStream;

public class W08P04 {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream(args[0]);
            while(true) {
                int data = is.read();
                if(data == -1) break;

                byte byteData = (byte) data;
                System.out.printf("%02X ", byteData);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}