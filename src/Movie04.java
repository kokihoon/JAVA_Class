public class Movie04 {
    public String title;
    public String directedBy;
    public int runningTime;
    public String releaseDate;

    public Movie04(String title, String directedBy, int runningTime, String releaseDate) {
        this.title = title;
        this.directedBy = directedBy;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
    }
    @Override
    public  String toString() {
        String directedByString;
        String releaseDate_Formatting;
        directedByString = runningTime /60 +"시간" +runningTime%60+"분";
        releaseDate_Formatting = releaseDate.substring(0,4)+"년"+releaseDate.substring(4,6)+"월"+releaseDate.substring(6,8)+"일";
        return "제목:"+title+"\n감독:"+directedBy+"\n상영시간:"+directedByString+"\n개봉일:"+releaseDate_Formatting;
    }
}
