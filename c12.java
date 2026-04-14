import java.util.Scanner;

class Volume {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolume(double radius, int dummy) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class c12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + v.calculateVolume(side));

        System.out.print("Enter length, width, height: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + v.calculateVolume(l, w, h));

        System.out.print("Enter radius of sphere: ");
        double r = sc.nextDouble();
        System.out.println("Volume of Sphere: " + v.calculateVolume(r, 1));

        sc.close();
    }
}