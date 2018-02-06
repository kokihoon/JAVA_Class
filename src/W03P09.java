import java.util.Scanner;

public class W03P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x[] = scanner.next().toCharArray();
        char z[] = consonant(x);
        System.out.println(z);
    }

    private static char[] consonant(char[] x) {
        char con[] = new char[x.length];
        int coun = 0;
        for(int i = 0; i < x.length; i++) {
            if(x[i] == 'S' || x[i] == 'a' || x[i] == 'e' || x[i] == 'i' || x[i] == 'o' || x[i] == 'u' || x[i] == 'E' || x[i] == 'O' || x[i] == 'I' || x[i] == 'U') {

            }
            else {
                con[coun++] = x[i];
            }
        }

        return con;
    }
}
