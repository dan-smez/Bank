import java.util.HashMap;

public class Bank {
    private String bankName;
    private HashMap<Integer, Account> accounts;
    private int routingNum;

    public Bank(String name, int routing) {
        this.bankName = name;
        this.routingNum = routing;
    }

    public void getName() {
        System.out.println(bankName);
    }

    public void getBankInfo() {
        System.out.println(routingNum);
    }

    public Account getAccountInfo(Double accountNum) {
        return accounts.get(accountNum);
    }
}
