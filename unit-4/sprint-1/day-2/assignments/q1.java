package sprint1Day2;

public class q1 {
	public static void checkWeather(boolean isSnowing, boolean isRaining, double temperature) {
		if ((isSnowing == true && isRaining == true) || (temperature < 50)) {
			System.out.println("Let’s stay home.");
		} else {
			System.out.println("Let’s go out!");
		}
	}

	public static void main(String[] args) {
		checkWeather(true, false, 20);

	}

}
