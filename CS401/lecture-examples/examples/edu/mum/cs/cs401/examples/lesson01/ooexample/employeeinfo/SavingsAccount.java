package edu.mum.cs.cs401.examples.lesson01.ooexample.employeeinfo;

public class SavingsAccount extends Account {
	private final double MONTHLY_INTEREST_RATE = 0.25;

	SavingsAccount(Employee e, double startBalance) {
		super(e, startBalance);
	}

	SavingsAccount(Employee e) {
		super(e);
	}

	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE / 100) * baseBalance;
		return baseBalance + interest;
	}

	@Override
	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

}
