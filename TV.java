/**
 * State Design Pattern 
 * TV class that can change to 3 different states, homeState, netflixState, and huluState
 * TV has buttons to change to Neflix, Hulu, Home, TV shows, and Moives
 */
public class TV {

    private State homeState;
    private State netflixState;
    private State huluState;
    //current state the TV is in
    private State state;

    /**
     * TV Constructor the creates new states for each possible state and sets the current state to Home
     */
    public TV() {
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        state = homeState;
    }
    /**
     * method to press the home button
     * will switch to the Home state or return that its already in the home state
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * method to press the Netflix button
     * will switch to the Netflix state or return that its already in the Netflix state
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();;
    }

    /**
     * method to press the Hulu button
     * will switch to the Hulu state or return that its already in the hulu state
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * method to press the movie button
     * will return Netflix or Hulu movies or return that it needs to be in netflix or hulu
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

     /**
     * method to press the TV shows button
     * will return Netflix or Hulu TV shows or return that it needs to be in netflix or hulu
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * change the TV state
     * @param state the state to change to
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * return the home state
     * @return state homestate
     */
    public State getHomeState() {
        return homeState;
    }

    /**
     * return the netflix state
     * @return state NetflixState
     */
    public State getNetflixState() {
        return netflixState;
    }

    /**
     * return the hulu state
     * @return state huluState
     */
    public State getHuluState() {
        return huluState;
    }
    
}
