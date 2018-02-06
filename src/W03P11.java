import java.util.Scanner;

public class W03P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x[] = scanner.next().toCharArray();
        char y[] = scanner.next().toCharArray();

        System.out.println(startsWith(x, y));
    }

    private static boolean startsWith(char[] x, char[] y) {


        for(int i = 0; i < y.length; i++) {
            if(x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }
}
