public class Checking extends Account {
    public Checking(String name, double deposit, int accNum) {
        this.holderName = name;
        this.balance = deposit;
        this.accountNum = accNum;
        this.rate = 0.01;
    }
}
