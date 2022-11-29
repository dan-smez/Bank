import java.util.HashMap;

public class Bank {
    private String bankName;
    private HashMap<Integer, Account> accounts = new HashMap<>();
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


    public void addAccount(String name, double deposit, int accNum) {
        Account newAcc = new Checking(name, deposit, accNum);
        System.out.println("Here is your account number: " + accNum);
        accounts.put(accNum, newAcc);
    }
    public Account getAccountInfo(int accountNum) {
        return accounts.get(accountNum);
    }
}
