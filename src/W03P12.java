import java.util.Scanner;

public class W03P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x[] = scanner.next().toCharArray();
        char y[] = scanner.next().toCharArray();

        System.out.println(indexOf(x, y));
    }

    private static boolean indexOf(char[] x, char[] y) {
        int x_length = x.length -1;
        int y_length = y.length -1, j = 0;
        int count = 0;
        for(int i = 0; i < x.length; i++) {
            if(x[i] == y[j]) {
                count++;
                j++;
            } else  {
                j = 0;
                count = 0;
            }
            if(count == y.length) {
                return true;
            }
        }
        return false;
    }
}
