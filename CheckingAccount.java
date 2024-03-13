public class CheckingAccount extends BankAccount {
    int overdraftFee = 0;

    public boolean debit(int pennies) {
        this.balance -= pennies;
        if (this.balance < 0) {
            this.balance -= overdraftFee;
        }
        return true;
    }

    public int getFee() {
        return this.overdraftFee;
    }

    public void setFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public void applyInterest() {
        if (this.balance > 0) {
            this.balance += (this.interestRate * this.balance);
        }
    }

    public String accountInfo() {
        return "Type of Account : Checking\n" +
               "Account ID      : " + this.getAccountID() + "\n" +
               "Current Balance : $" + String.format("%.2f", this.getBalance() / 100.0) + "\n" +
               "Interest rate   : " + String.format("%.2f", this.getInterestRate() * 100) + "%" + "\n" +
               "Overdraft Fee   : $" + String.format("%.2f", this.getFee() / 100.00);
    }
}