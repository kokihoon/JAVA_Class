import java.util.Scanner;

public class W03P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x[] = scanner.next().toCharArray();
        char z[] = prefix(x, 3);
        System.out.println(z);
    }

    private static char[] prefix(char[] x, int i) {
        char split[] = new char[i];

        for(int k = 0; k < i; k++) {
            split[k] = x[k];
        }
        return split;
    }
}
