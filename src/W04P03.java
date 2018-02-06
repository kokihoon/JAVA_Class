public class W04P03 {
    public static void main(String[] args) {
        char x[] = args[0].toCharArray();
        char y[] = args[1].toCharArray();

        System.out.println(concat(x, y));
    }

    private static char[] concat(char[] x, char[] y) {
        char[] sum = new char[x.length+y.length];
        int j = 0;
        for(int i = 0; i < x.length; i++) {
            sum[j++] = x[i];
        }
        for(int i = 0; i < y.length; i++) {
            sum[j++] = y[i];
        }
        return sum;
    }
}
