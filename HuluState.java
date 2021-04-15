/**
 * HuluState class that implements State, a State for the TV to be in
 * Methods represent TV remote buttons and allow the TV to change states from Home, Netflix, Hulu, and watch movies or TV shows
 * @author ddkeen
 */
public class HuluState implements State {

    private TV tv;
    //hulu tv shows and movies
    private String[] MOVIES = {"Terminator", "Fast and the Furious",  "Jungle Book", "Star Wars", "Mission Impossible"};
    private String[] TVSHOWS = {"Parks and Rec", "HIMYM", "Law & Order", "Friends", "Chopped"};


    public HuluState(TV tv) {
        this.tv = tv;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        for(int i=0; i<MOVIES.length; i++)
            System.out.println("- " + MOVIES[i]);
        System.out.println();
    }
    
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        for(int i=0; i<MOVIES.length; i++)
            System.out.println("- " + TVSHOWS[i]);
        System.out.println();
    }
}
