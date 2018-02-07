public class Movie07 {
    public String title;
    public String directedBy;
    public int runningTime;
    public Date07 releaseDate;

    public Movie07(String title, String directedBy, int runningTime, Date07 releaseDate) {
        this.title = title;
        this.directedBy = directedBy;
        this.runningTime = runningTime;
        this.releaseDate = releaseDate;
    }
    @Override
    public String toString() {
        return title+"," +directedBy+","+runningTime+","+releaseDate;
    }
}
