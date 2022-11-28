public class Account {
    private Long accountNum;
    private Double balance;
    private Double rate;

    public Account(Double deposit) {
        this.balance = deposit;
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
