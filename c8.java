import java.util.Scanner;

class Point {
    int x, y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class c8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Default Constructor:");
        Point p1 = new Point();
        p1.display();

        System.out.print("Enter x and y for parameterized constructor: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        System.out.println("Parameterized Constructor:");
        p2.display();

        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();

        sc.close();
    }
}