public class W05P01 {
    public static void main(String[] args) {
        Movie01 movie = new Movie01();
        movie.title="The Matrix";
        movie.directedBy = "The Wachowski Brothers";
        movie.runningTime = 136;
        movie.releaseDate = "19990331";

        System.out.println(movie.title +","+movie.directedBy+"," + movie.runningTime+","+movie.releaseDate);
    }
}
