import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after deposit = " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance after withdrawal = " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest(double rate) {
        return balance * rate / 100;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(double rate, int time) {
        return balance + (balance * rate * time / 100);
    }
}

public class c14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        FixedDepositAccount fd = new FixedDepositAccount();

        System.out.println("Enter Saving Account details:");
        int accNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double bal = sc.nextDouble();
        sa.openAccount(accNo, name, bal);

        sa.checkBalance();

        System.out.println("Enter deposit amount:");
        sa.deposit(sc.nextDouble());

        System.out.println("Enter withdraw amount:");
        sa.withdraw(sc.nextDouble());

        System.out.println("Enter interest rate:");
        double rate = sc.nextDouble();
        System.out.println("Interest = " + sa.calculateInterest(rate));

        System.out.println("Enter Fixed Deposit details:");
        int accNo2 = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();
        double bal2 = sc.nextDouble();
        fd.openAccount(accNo2, name2, bal2);

        System.out.println("Enter rate and time:");
        double r = sc.nextDouble();
        int t = sc.nextInt();
        System.out.println("Maturity Amount = " + fd.maturityAmount(r, t));
    }
}