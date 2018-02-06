import java.util.Scanner;

public class W03P07 {
    public static void main(String[] args) {
        int x[] = new int[3];
        int y[] = new int[3];
        int z[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            z[i] = scanner.nextInt();
        }

        int w[] = new int[3];
        w = add(x, y);
        w = add(w,z);
        for(int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
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
