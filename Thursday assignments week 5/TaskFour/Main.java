import java.util.ArrayList;
import java.util.Arrays;

//4. e
public class Main{
	public static void main(String[] args){

		//4. f
		ArrayList<String> actions = new ArrayList<String>(Arrays.asList("Start game", "Resume game", "Pause game", "End game"));

		//4. g
		GameMenu menuOne = new GameMenu(actions);

		//4. i
		menuOne.displayMenu();
	}
}