import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static GameMenu menuOne;

	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<String>(Arrays.asList("Start game", "Resume game", "Pause game", "End game"));

		menuOne = new GameMenu(actions);

		//menuOne.displayMenu();

		//5. d
		menuOne.getAction();
	}

	//5. e
	public static void doAction(int action) {
		System.out.println(menuOne.getAction());
	}
}