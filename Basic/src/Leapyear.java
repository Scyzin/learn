//输入框输入，判断闰年。
//运用JOptionPane,逻辑运算符。从控制台中输入。
import javax.swing.JOptionPane;
public class Leapyear {

	public static void main(String[] args) {
		String yearString = JOptionPane.showInputDialog("Enter a year");
		int year = Integer.parseInt(yearString);
		boolean isLeapYear = 
				(year % 4 == 0 && 100!=0) ||(year % 400 == 0);
		String output = year + "is a leap year? " + isLeapYear;
		JOptionPane.showMessageDialog(null,output);
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = input.nextInt();
		System.out.println(year + "is a leap year?" + isLeapYear);*/
	}

}