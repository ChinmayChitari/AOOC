class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance(){
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount { 
    public SavingsAccount(double balance){
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount>0&&(balance-amount)>=100){
            balance-=amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.out.println(" Minimum balance of 100 must be maintained.");
        }
    }
}

public class bank{
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);

        account.displayBalance();
        account.deposit(200);
        account.displayBalance();

        account.withdraw(450);
        account.displayBalance();

        account.withdraw(300);
        account.displayBalance();
    }
}
