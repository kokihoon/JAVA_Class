import java.io.FileInputStream;


public class W08P01 {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            int sum = 0;
            while (true) {
                int data = fileInputStream.read();
                if (data == -1) break;
                sum += data;

            }
            System.out.println("File size: "+sum+" bytes");
        }
        catch (Exception e) {}
    }
}
