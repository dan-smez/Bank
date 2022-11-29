public class Account {
    protected String holderName;
    protected int accountNum;
    protected double balance;
    protected double rate;
    protected void checkAccInfo() {
        System.out.println(holderName);
        System.out.println(accountNum);
        System.out.println(balance);
        System.out.println(rate);
        System.out.println();
    }
    protected void checkBalance() {
        System.out.println(balance);
    }

    protected void checkRate() {
        System.out.println(rate);
    }
}
