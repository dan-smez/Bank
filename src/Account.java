public class Account {
    private String holderName;
    private int accountNum;
    private double balance;
    private double rate;

    public Account(String name, double deposit, int accNum) {
        this.holderName = name;
        this.balance = deposit;
        this.accountNum = accNum;
        this.rate = 0.01;
    }

    public void checkAccInfo() {
        System.out.println(holderName);
        System.out.println(accountNum);
        System.out.println(balance);
        System.out.println(rate);
        System.out.println();
    }

    public void checkBalance() {
        System.out.println(balance);
    }

    public void checkRate() {
        System.out.println(rate);
    }
}
