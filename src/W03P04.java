import java.util.Scanner;

public class W03P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n[] = new int[5];

        for(int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }

        System.out.println(max(n));
    }

    private static int max(int[] n) {
        int max = n[0];
        for(int i = 0; i < n.length; i++) {
            if(max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }
}
