public class NetflixState implements State{

    private TV tv;

    private String[] MOVIES = {"Freinds with Benefits", "21 and Over",  "Frozen", "James Bond", "American Hustle"};
    private String[] TVSHOWS = {"Spongebob", "Big Little Lies", "Dexter", "The Voice", "Jeopardy"};


    public NetflixState(TV tv) {
        this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        for(int i=0; i<MOVIES.length; i++)
            System.out.println("- " + MOVIES[i]);
        System.out.println();
    }

    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        for(int i=0; i<MOVIES.length; i++)
            System.out.println("- " + TVSHOWS[i]);
        System.out.println();
    }
    
}