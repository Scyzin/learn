//计算平均值
import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		//控制台输入
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers");
		//读入Scaaner,nextDouble
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double average = (number1 + number2 + number3) / 3;
		//输出，+也做字符串的连接
		System.out.println("The Average of " + number1 + " " + number2 +" " + number3 +  " is " + average);
		//定义常量   大写 final double PI
	}

}
