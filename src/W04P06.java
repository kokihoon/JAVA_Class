public class W04P06 {
    public static void main(String[] args) {
        boolean palindromeYN = palindromeYN(args[0]);
        System.out.println(palindromeYN);
    }

    private static boolean palindromeYN(String arg) {
        int sp = 0, ep = arg.length()-1;
        char x[] = arg.toCharArray();
        for(int i = 0; i < arg.length()/2; i++) {
            if(x[sp] != x[ep]) {
                return false;
            }
        }

        return true;
    }
}
