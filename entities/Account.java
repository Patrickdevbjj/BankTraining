package entities;

public class Account {
 
    private int number;
    private String holder;
    private double balance;
    
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }


    public void deposit(double amount) {
        this.balance += amount;
    }
}
