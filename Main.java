public class Main {
   public static void main(String[] args) {
      TestAccount account = new TestAccount();
      account.setAccountID("1234-5678-9012-3456");
      account.setInterestRate(0.02);
      System.out.println(account.accountInfo());

      account.credit(1000);
      System.out.println(account.accountInfo());

      account.applyInterest();
      System.out.println(account.accountInfo());
   }
}