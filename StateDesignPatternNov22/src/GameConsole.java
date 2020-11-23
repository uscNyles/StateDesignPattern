
public class GameConsole {

	private State HomeState;
	private State NintendoState;
	private State XBoxState;
	
	
	private State state;

	public GameConsole() {
		HomeState = new HomeState(this);
		NintendoState = new NintendoState(this);
		XBoxState = new XBoxState(this);
		this.setState(HomeState);
		
		System.out.println("Starting up the Game console");
		System.out.println();

	}

	public void pressHomeButton() {
		this.state.pressHomeButton();
	}

	public void pressNintendoButton() {
		this.state.pressNintendoButton();
	}

	public void pressXBoxButton() {
		this.state.pressXBoxButton();
	}

	public void pressGameButton() {
		this.state.pressGameButton();
	}

	public void setState(State state) {
		this.state=state;
	}

	public State getHomeState() {
		return HomeState;
		
	}

	public State getNintendoState() {
		return NintendoState;
	}

	public State getXBoxState() {
		return XBoxState;
	}
}
