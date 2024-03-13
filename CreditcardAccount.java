public class CreditcardAccount extends BankAccount {
    private int limit = 0;

    public boolean debit(int pennies) {
        if (this.balance - pennies >= -this.limit) {
            this.balance -= pennies;
            return true;
        }
        return false;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int creditLimit) {
        this.limit = creditLimit;
    }

    public void applyInterest() {
        if (this.balance <= 0) {
            this.balance += (this.interestRate * this.balance);
    }
}

    public String accountInfo() {
        return "Type of Account : Creditcard\n" +
               "Account ID      : " + this.getAccountID() + "\n" +
               "Current Balance : $" + String.format("%.2f", -this.getBalance() / 100.0) + "\n" +
               "Interest rate   : " + String.format("%.2f", this.getInterestRate() * 100) + "%" + "\n" +
               "Credit Limit    : $" + String.format("%.2f", this.getLimit() / 100.00);
    }
}
