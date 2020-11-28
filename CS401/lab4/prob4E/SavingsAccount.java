package prob4E;


public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String acctId;

    public SavingsAccount(String acctId, double interstRate, double startBalance) {
        this.acctId = acctId;
        this.interestRate = interstRate;
        this.balance = startBalance;
    }

    @Override
    public String getAccountID() {
        return this.acctId;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return this.balance + (this.balance * this.interestRate);
    }
    
}
