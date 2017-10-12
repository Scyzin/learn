//计算贷款总额，显示余额支付额和总支付额
import javax.swing.JOptionPane;
public class ComputeLoanUsingInputDialog {

	public static void main(String[] args) {
		String annualInterestRateString = JOptionPane.showInputDialog(
				"Enter yearly interest rate, for example 8.25:");
		double annualInterestRate = 
				Double.parseDouble(annualInterestRateString);
		double monthlyInterestRate = annualInterestRate / 1200;
		String numberOfYearString = JOptionPane.showInputDialog(
				"Enter number of years as an integer,\nfor example 5:");
		int numberOfYears = Integer.parseInt(numberOfYearString);
		String loanString = JOptionPane.showInputDialog(
				"Enter loan amout, for example 120000.95:");
		double loanAmout = Double.parseDouble(loanString);
		double monthlyPayment = loanAmout * monthlyInterestRate / (1
				- 1 / Math.pow(monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		totalPayment = (int)(totalPayment * 100) / 100.0;
		String output = "The monthly payment is " + monthlyPayment +
				"\nThe total payment is " + totalPayment;
		JOptionPane.showMessageDialog(null, output);

	}

}
