import java.util.Scanner;

class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate;

    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    static void setInterestRate(double rate) {
        interest_rate = rate;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }
}

public class c10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();
        BankAccount.setInterestRate(rate);

        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(name, bal);

        acc.display();

        sc.close();
    }
}