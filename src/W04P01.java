public class W04P01 {
    public static void main(String[] args) {
        char x[] = args[0].toCharArray();
        char y[] = args[1].toCharArray();
        System.out.println(equals(x, y));
    }

    private static boolean equals(char[] x, char[] y) {
        for(int i = 0; i < x.length; i++) {
            if(x[i] != y[i]) {
                return false;
            }
        }
        return true;
    }
}
