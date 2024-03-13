public class SavingsAccount extends BankAccount {
    public boolean debit(int pennies) {
        if (pennies <= this.balance) {
            this.balance -= pennies;
            return true;
        } else {
            return false;
        }
    }

    public void applyInterest() {
        if (this.balance > 0) {
            this.balance += (this.interestRate * this.balance);
        }
    }

    public String accountInfo() {
           return "Type of Account : Savings\n" +
               "Account ID      : " + this.getAccountID() + "\n" +
               "Current Balance : $" + String.format("%.2f", this.getBalance() / 100.0) + "\n" +
               "Interest rate   : " + String.format("%.2f", this.getInterestRate() * 100) + "%";
    }
}

