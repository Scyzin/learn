//生成随机数，判断正误。
import java.util.Scanner;

public class SubtaracionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.print("number1" + number1 + "-" + 
		"number2" + number2 +"=" + "number1 - number2");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if (number1 - number2 == answer)
			System.out.print("You are right");
		else
			System.out.println("Your answer is wrong\n"+
		number1 + "-" + number2 + "should be " + (number1 - number2));
	}

}
