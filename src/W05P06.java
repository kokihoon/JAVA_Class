import static java.lang.Integer.parseInt;

public class W05P06 {
    public static void main(String[] args) {
        Movie06 movies[] = new Movie06[6];

        movies[0] = new Movie06("매트릭스","워쇼스키형제",136,"19990331");
        movies[1] = new Movie06("아바타","워쇼스키형제",161,"20091210");
        movies[2] = new Movie06("인셉션","워쇼스키형제",148,"20100708");
        movies[3] = new Movie06("소스코드","워쇼스키형제",93,"20110311");
        movies[4] = new Movie06("13층","워쇼스키형제",100,"19990416");
        movies[5] = new Movie06(args[0],args[1],Integer.parseInt(args[2]), args[3]);
        printMovieGuinness(movies);
    }

    private static void printMovieGuinness(Movie06[] movies) {

        Movie06 classMovie = movies[0];
        Movie06 classMovie1 = movies[0];
        Movie06 classMovie2 = movies[0];

        for(Movie06 str : movies) {
            if(str.runningTime > classMovie.runningTime) {
                classMovie = str;
            }
            if(parseInt(classMovie1.releaseDate.substring(4,6)) < parseInt(str.releaseDate.substring(4,6))) {
                classMovie1 = str;
            }
            if(str.runningTime < classMovie2.runningTime) {
                classMovie2 = str;
            }
        }


        System.out.println("연중최후개봉영화: " + classMovie1);
        System.out.println("최장시간상영영화: " + classMovie);
        System.out.println("최소시간상영영화: " + classMovie2);
    }
}
