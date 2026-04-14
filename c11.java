import java.util.Scanner;

class College {
    String collegeName;

    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void readData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void displayData() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class c11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter college name: ");
        String cname = sc.nextLine();

        College col = new College(cname);

        College.Admission adm = col.new Admission();

        adm.readData();
        adm.displayData();

        sc.close();
    }
}