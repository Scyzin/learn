//最大公约数
import java.util.Scanner;
public class GreatestCommonDivisorMethod {
	/*	主要方法*/
	public static void main(String[] args) {
		//创建一个输入器
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer");
		int n1 = input.nextInt();
		System.out.println("Enter second integer");
		int n2 = input.nextInt();
		
		System.out.println("The greatset common divisor for " +
		 n1 + " and " + n2 + " is " + gcd(n1,n2));
		
	}
	//创建最大公约数方法，静态变量
	public static int gcd (int n1, int n2) {
		int gcd = 1;
		int k = 2;
		
		while(k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0 )
				gcd =k;
			k++;
		}
		return gcd;
	}

}
