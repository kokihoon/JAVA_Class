import java.util.Scanner;

public class W03P06 {
    public static void main(String[] args) {
        int x[] = new int[3];
        int y[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        int z[] = add(x,y);

        for(int i =0; i< z.length; i++) {
            System.out.println(z[i] + " ");
        }
    }

    private static int[] add(int[] x, int[] y) {
        int z[] = new int[3];
        for(int i = 0; i < x.length; i++) {
            z[i] = x[i] + y[i];
        }
        return z;
    }
}
