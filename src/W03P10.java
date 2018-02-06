import java.util.Scanner;

public class W03P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x[] = scanner.next().toCharArray();
        char y[] = scanner.next().toCharArray();

        System.out.println(endsWith(x, y));
    }

    private static boolean endsWith(char[] x, char[] y) {

        int x_length = x.length-1;
        int y_length = y.length-1;
        for(int i = y.length; i != 0; i--) {
            if(x[x_length--] != y[y_length--]) {
                return false;
            }
        }
        return true;
    }
}
