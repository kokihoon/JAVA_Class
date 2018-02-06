public class W04P05 {
    public static void main(String[] args) {
        char x[] = args[0].toCharArray();
        int sp = Integer.parseInt(args[1]);
        int ep = Integer.parseInt(args[2]);
        char z[] = substring(x, sp, ep);
        System.out.println(z);
    }
    private static char[] substring(char[] x, int sp, int ep) {
        char[] sub = new char[ep-sp];
        int j = 0;
        for(int i = sp; i < ep; i++) {
            sub[j++] = x[i];
        }
        return sub;
    }
}
