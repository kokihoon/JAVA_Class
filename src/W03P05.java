import java.util.Scanner;

public class W03P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n[] = new int[5];

        for(int i =0; i < n.length;i++) {
            n[i] = scanner.nextInt();
        }
        System.out.println(min(n));
    }

    private static int min(int[] n) {
        int min = n[0];
        for(int i = 0; i < n.length; i++) {
            if(min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }
}
