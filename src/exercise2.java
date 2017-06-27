import java.util.ArrayList;

public class exercise2 {

	public static void main(String[] args) {
		ArrayList<Boolean> trueOrFalse = new ArrayList<Boolean>();

		trueOrFalse.add(true);
		trueOrFalse.add(false);
		trueOrFalse.add(false);
		trueOrFalse.add(true); 
		trueOrFalse.add(false);

		for (Boolean right: trueOrFalse) {
			if (right) {
				System.out.println("Better bring an umbrella");
			} else {
				System.out.println("No rain today, enjoy the sun!");
			}

		}
	}
}
