public class BankAcTest {
    public static void main(String args[]) {
        SavingAC bnk1 = new SavingAC(101, "ragini", 5000.0, 5.0);
        System.out.println("Interest: " + bnk1.calculateInterest());
        bnk1.displayBalance();

        CurrentAc bnk2 = new CurrentAc(102, "ragini99", 5000.0, 500.0);
        bnk2.checkOverdraft();
        bnk2.displayBalance();
    }
}

class Bank {
    long acountNo;
    String acHolder;
    double balance;

    Bank(long acountNo, String acHolder, double balance) {
        this.acountNo = acountNo;
        this.acHolder = acHolder;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Bank → accountNumber=" + acountNo +
            ", accountHolder=" + acHolder +
            ", balance=" + balance);
    }
}

class SavingAC extends Bank {
    double interestRate;

    SavingAC(long acountNo, String acHolder, double balance, double interestRate) {
        super(acountNo, acHolder, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return super.balance * interestRate / 100;
    }

    public void setInterestRate(double interestRate) {
        if (super.balance > 1000) {
            this.interestRate = interestRate;
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("SavingsAccount → accountNumber=" + super.acountNo +
            ", accountHolder=" + super.acHolder +
            ", balance=" + super.balance +
            ", interestRate=" + interestRate + "%");
    }
}

class CurrentAc extends Bank {
    double overdraftLimit;

    CurrentAc(long acountNo, String acHolder, double balance, double overdraftLimit) {
        super(acountNo, acHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft() {
        overdraftLimit = super.balance * 0.05;
        System.out.println("OverdraftLimit = " + overdraftLimit);
    }

    @Override
    public void displayBalance() {
        System.out.println("CurrentAccount → accountNumber=" + super.acountNo +
            ", accountHolder=" + super.acHolder +
            ", balance=" + super.balance +
            ", overdraftLimit=" + overdraftLimit);
    }
}
