public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my program");
        Bank tdBank = new Bank("TD Bank", 100000);
        tdBank.getName();

        Bank chaseBank = new Bank("Chase Bank", 200000);
        chaseBank.getName();

        chaseBank.addAccount("Dan S.", 100.00, 123456789);
        Account myAccount = chaseBank.getAccountInfo(123456789);
        myAccount.checkAccInfo();
    }
}