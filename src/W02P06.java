public class W02P06 {
    public static void main(String[] args) {
        int sum = 1;
        for(int i = 1; i <= 10;i++) {
            sum *= i;
        }
        System.out.println("10! = " + sum);
    }
}
