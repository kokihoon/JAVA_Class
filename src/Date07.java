public class Date07 {
    public int year;
    public int month;
    public int day;

    @Override
    public String toString() {
        if(month < 10)
            return year+"-0"+month+"-"+day;
        else
            return year+"-"+month+"-"+day;
    }
}
