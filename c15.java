import java.util.Scanner;

class Employee {
    String name, department;

    void getData(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String project;

    void getManagerData(String name, String department, int teamSize, String project) {
        this.name = name;
        this.department = department;
        this.teamSize = teamSize;
        this.project = project;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class c15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Enter Employee details:");
        String name = sc.nextLine();
        String dept = sc.nextLine();
        e.getData(name, dept);

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println("Enter Manager details:");
        String mname = sc.nextLine();
        String mdept = sc.nextLine();
        int size = sc.nextInt();
        sc.nextLine();
        String project = sc.nextLine();
        m.getManagerData(mname, mdept, size, project);

        System.out.println("Manager Details:");
        m.displayDetails();
    }
}