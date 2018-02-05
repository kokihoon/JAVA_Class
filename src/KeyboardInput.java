import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수(0~100)를 입력하세요: ");
        int score = scanner.nextInt();
        if(score >= 70) System.out.println("PASS");
        else System.out.println("FAIL");
    }
}
