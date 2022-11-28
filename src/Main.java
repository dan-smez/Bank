public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my program");
        Bank tdBank = new Bank("TD Bank", 100000);
        tdBank.getName();
        tdBank.getBankInfo();
        Bank allyBank = new Bank("Ally Bank", 200000);
        allyBank.getName();
        allyBank.getBankInfo();
    }
}