//输入框输入，判断闰年。
//运用JOptionPane,逻辑运算符。从控制台中输入。
import javax.swing.JOptionPane;
public class Leapyear {

	public static void main(String[] args) {
		String yearString = JOptionPane.showInputDialog("Enter a year");
		int year = Integer.parseInt(yearString);//字符转换为整数
		boolean isLeapYear = 
				(year % 4 == 0 && year % 100!=0) ||(year % 400 == 0);//判断闰年的狮子
		String output = year + "is a leap year? " + isLeapYear;
		JOptionPane.showMessageDialog(null,output);
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = input.nextInt();
		System.out.println(year + "is a leap year?" + isLeapYear);*/
	}

}
