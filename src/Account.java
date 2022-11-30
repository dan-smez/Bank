public class Account {
    protected String holderName;
    protected int accountNum;
    protected double balance;
    protected Account(String name, double deposit, int accNum) {
        this.holderName = name;
        this.balance = deposit;
        this.accountNum = accNum;
    }
    protected void checkAccInfo() {
        System.out.println(holderName);
        System.out.println(accountNum);
        System.out.println(balance);
        System.out.println();
    }
    protected void checkBalance() {
        System.out.println(balance);
    }
}
