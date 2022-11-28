import java.util.HashMap

public class Bank {
    private String bankName;
    private HashMap<Long, Account> accounts;

    public Bank(String name) {
        this.bankName = name;
    }

    public void getName() {
        System.out.println(bankName);
    }

    public Account getAccountInfo(Long accountNum) {
        return accounts.get(accountNum);
    }
}
