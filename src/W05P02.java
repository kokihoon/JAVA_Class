public class W05P02 {
    public static void main(String[] args) {
        Movie02 movie = new Movie02("The Matrix", "The Wachowski", 136, "19990331");
        System.out.println(movie.title+"," + movie.directedBy+"," +movie.runningTime+"," +movie.releaseDate);
    }
}
