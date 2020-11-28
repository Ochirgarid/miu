package prob4E;

import java.util.ArrayList;

public class Employee {
    private String name;

    private ArrayList <Account> ownedAccounts;

    public Employee(String empName) {
        this.name = empName;
        this.ownedAccounts = new ArrayList <Account>();
    }

    public String getName() {
        return name;
    }

    public double computeUpdatedBalanceSum() {
        double balanceSum = 0.0;
        for(Account a: this.ownedAccounts) {
            balanceSum += a.computeUpdatedBalance();
        }
        return balanceSum;
    }

    public void addAccount(Account acct) {
        this.ownedAccounts.add(acct);
    }
}
