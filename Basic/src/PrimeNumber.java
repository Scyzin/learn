//显示素数
public class PrimeNumber {
	public static void main(String[] args) {
	final int NUMBER_OF_PRIMES = 50;//要显示的素数个数
	final int NUMBER_OF_PRIMES_PER_LINE = 10;//每行一个素数
	int count = 0;//素数个数
	int number = 2;//素数的测试
	
	System.out.println("前50个素数为：");
	while(count < NUMBER_OF_PRIMES) {
		boolean isPrime = true;//是素数吗？
		//判断素数
		for (int divisor = 2;divisor <= number / 2;divisor ++) {
			if (number % divisor == 0) {
				isPrime = false;//不是素数
				break;
			}
		}
		if (isPrime) {
			count++;//素数个数+1
			if (count % NUMBER_OF_PRIMES_PER_LINE ==0) {
				System.out.println(number);
			}
			else
				System.out.print(number + " ");
		}
		number ++;
		}
	}
}
