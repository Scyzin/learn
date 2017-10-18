//loan类
public class Loan {
		private double annualInterestRate;
		private int numberOfYears;
		private double loanAmount;
		private java.util.Date loanDate;
	//默认构造器
	public Loan() {
		this(2.5, 1, 1000);
	}
	public Loan(double annualInterestRate, int numberOfYears,
			double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();		
	}
	
	//返回年利率
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//？
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	//寻找月支出
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200 ;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(Math.pow(1 /(1 + monthlyInterestRate), numberOfYears *12)));
		return monthlyPayment;
	}
	//总支出
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment()* numberOfYears * 12;
		return totalPayment;
	}
	//返回利率
	public java.util.Date getLoanDate(){
		return loanDate;
	}

}
