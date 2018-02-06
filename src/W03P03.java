import java.util.Scanner;

public class W03P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n[] = new int[5];

        for(int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }
        System.out.println(sum(n));
    }

    private static int sum(int[] n) {
        int sum = 0;
        for(int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }
}
