public class Savings extends Account {
    private double rate;

    public Savings(String name, double deposit, int accNum) {
        super(name, deposit, accNum);
        rate = 0.01;
    }

    @Override
    protected void checkAccInfo() {
        System.out.println(holderName);
        System.out.println(accountNum);
        System.out.println(balance);
        System.out.println(rate);
        System.out.println();
    }
}
