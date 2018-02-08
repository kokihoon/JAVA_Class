import java.io.FileInputStream;
import java.io.FileOutputStream;

public class W08P05 {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream(args[0]);
            FileOutputStream os = new FileOutputStream(args[0]+".enc");
            while(true) {
                int data = is.read();
                if(data == -1) break;

                byte byteData = (byte) data;
                byte four_shift = 4;
                byte left_byte = (byte)(byteData<<four_shift);
                byte right_byte = (byte)(byteData>>four_shift);
                byte complete = (byte)(left_byte | right_byte);
                os.write(complete);
                System.out.printf("%02X %02X\n", byteData, complete);

            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
