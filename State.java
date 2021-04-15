/**
 * State interface for HomeState, NetflixState, and HuluState, the 3 states the TV can be in
 * Methods represent TV remote buttons and allow the TV to change states from Home, Netflix, Hulu, and watch movies or TV shows
 * @author ddkeen
 */
public interface State {

    public void pressHomeButton();

    public void pressNetflixButton();

    public void pressHuluButton();

    public void pressMovieButton();

    public void pressTVButton();
    
}
