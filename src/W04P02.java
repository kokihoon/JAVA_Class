public class W04P02 {
    public static void main(String[] args) {
        char x[] = args[0].toCharArray();

        System.out.println(reverse(x));
    }

    private static char[] reverse(char[] x) {
        char y[] = new char[x.length];
        for(int i = 0; i < x.length; i++) {
            y[x.length-1-i] = x[i];
        }
        return y;
    }
}
