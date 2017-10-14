//彩票中奖
import java.util.Scanner;
public class Lottery {
	public static void main(String[] args) {
		//产生一个小于99的随机数
		int lottery = (int)(Math.random() * 100);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery prick (two digits");
		int guess = input.nextInt();
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		System.out.println("The lottery number is " + lottery);
		//猜数字
		if(guess == lottery)
			System.out.println("Exact match : you win $10,0000");
		else if (guessDigit1 == lotteryDigit1
			|| guessDigit1 == lotteryDigit2
			|| guessDigit2 == lotteryDigit1
			|| guessDigit2 == lotteryDigit2)
			System.out.println("Match ont digit : you win $1,000");
		else
			System.out.println("Sorry, no match");
			}
}
