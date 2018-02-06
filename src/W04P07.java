public class W04P07 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        String w[] = split(args[0], ',');
        for(int i = 0; i < w.length; i++) {
            System.out.println(w[i].length()+"\t["+w[i]+"]");
        }
    }
    private static String[] split(String arg, char ch) {
        char x[] = arg.toCharArray();
        int count = 0;
        for(int i = 0; i < x.length; i++) {
            if(ch == x[i]) {
                count++;
            }
        }
        int cou[] = new int[count +2];
        cou[0] = 0;
        cou[count+1] = x.length;
        int k =1;
        String str[] = new String[count+1];
        for(int i = 0; i < x.length; i++) {
            if(ch == x[i]) {
                cou[k++] = i;
            }
        }
        for(int i = 0; i < str.length; i++) {
            if(i == 0)
                str[i] = arg.substring(cou[i], cou[i+1]);
            else {
                str[i] = arg.substring(cou[i]+1, cou[i+1]);
            }
        }

        return str;
    }
}
