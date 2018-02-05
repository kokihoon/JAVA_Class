public class W02P05 {
    public static void main(String[] args) {
        int first = 0, second = 1, sum = 0, temp = 0;

        for(int i = 0; i < 20; i++) {
            if(i == 0) {
                System.out.print(first + " ");
            }
            else if(i == 1) {
                System.out.print(second+ " ");
            }else {
                sum = first+second;
                first = second;
                second = sum;
                System.out.print(sum + " ");
            }
        }
    }
}
