package number_guessing_game;
import java.util.Scanner;
import java.lang.Math;
public  class Main {
	public static String guessGame() {
		int k =10 ; //num of tries to guess 
		double x =10;
		for (int i=1 ; i<=k; i++) {
			Scanner scan = new Scanner(System.in); 
			int guess=scan.nextInt();
			switch (Double.compare(x,guess)) {
			case -1 :
				System.out.println("your guess is bigger than the random number");
				break;
			case 1 :
				System.out.println("your guess is smaller than the random number");
				break;
			case 0:
				System.out.println("you got it right!!!");
				return "great job!! you guessed it right";			
			}					

		}
		return "sorry,you werent able to guess";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guessGame());
	}

}
