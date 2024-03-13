public abstract class BankAccount {
    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate = 0.0;
    protected int balance = 0;

    public boolean credit(int pennies) {
        this.balance += pennies;
        return true;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getAccountID() {
        return this.accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public abstract boolean debit(int pennies);

    public abstract void applyInterest();

    public abstract String accountInfo();
}