//猜数字游戏
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		//产生一个随机数
		int number = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1;
		while (guess != number) {
			System.out.println("\n Enter your number :");
			guess = input.nextInt();//读取输入数字
			if(guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
			
		}
		
	}

}
