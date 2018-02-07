public class Movie05 {
    public String AllString;
    public Movie05(String AllString) {
        this.AllString = AllString;
    }
    @Override
    public String toString() {
        String date[] = AllString.split(":");
        String str1="";
        for(int i = 0; i < date.length;i++) {
            if(i == date.length -1) {
                str1 += date[i];
            }
            else {
                str1 += date[i] +",";
            }
        }
        return str1;
    }
}
