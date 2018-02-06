public class W04P04 {
    public static void main(String[] args) {
        char x[] = toCharArray(args[0]);
        System.out.println(x);
    }
    private static char[] toCharArray(String arg) {
        char toChar[] = new char[arg.length()];

        for(int i = 0; i < arg.length(); i++) {
            toChar[i] = arg.charAt(i);
        }
        return toChar;
    }
}
