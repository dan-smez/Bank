public class Account {
    private Double accountNum;
    private Double balance;
    private Double rate;

    public Account(Double deposit, Double accNum) {
        this.balance = deposit;
        this.accountNum = accNum;
    }

    public void printAccountNumber() {
        System.out.println(accountNum);
    }

    public void checkBalance() {
        System.out.println(balance);
    }

    public void checkRate() {
        System.out.println(rate);
    }
}
