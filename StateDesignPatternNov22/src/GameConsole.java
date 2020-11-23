
public class GameConsole {

	private State HomeState;
	private State NintendoState;
	private State XBoxState;
	
	
	private State state;

	public GameConsole() {
		HomeState = new HomeState(this);
		NintendoState = new NintendoState(this);
		XBoxState = new XBoxState(this);
		

	}

	public void pressHomeButton() {

	}

	public void pressNintendoButton() {

	}

	public void pressXBoxButton() {

	}

	public void pressGameButton() {

	}

	public void setState(State state) {

	}

	public State getHomeState() {

	}

	public State getNintendoState() {

	}

	public State getXBoxState() {

	}
}
