import java.util.Scanner;

class TablePrinter {
    synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println();
    }
}

class MyThread extends Thread {
    int num;
    TablePrinter tp;

    MyThread(TablePrinter tp, int num) {
        this.tp = tp;
        this.num = num;
    }

    public void run() {
        tp.printTable(num);
    }
}

public class c25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        TablePrinter tp = new TablePrinter();

        MyThread t1 = new MyThread(tp, n1);
        MyThread t2 = new MyThread(tp, n2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Execution completed");
        sc.close();
    }
}