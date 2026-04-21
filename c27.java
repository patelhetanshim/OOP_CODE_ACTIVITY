import java.io.*;
import java.util.Scanner;

public class c27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            fw = new FileWriter("students.txt", true);

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter details for student " + i + ":");
                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                fw.write(roll + " " + name + " " + marks + "\n");
            }

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error occurred");
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
                sc.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}

/*
Output:

Case 1: New File
Enter number of students: 3
Enter details for student 1:
Roll No: 101
Name: Hetanshi
Marks: 85
Enter details for student 2:
Roll No: 102
Name: Rahul
Marks: 78
Enter details for student 3:
Roll No: 103
Name: Priya
Marks: 92

Student Records:
101 Hetanshi 85
102 Rahul 78
103 Priya 92

Case 2: Append Data
Enter number of students: 1
Enter details for student 1:
Roll No: 104
Name: Amit
Marks: 88

Student Records:
101 Hetanshi 85
102 Rahul 78
103 Priya 92
104 Amit 88

Case 3: Invalid Input
Enter number of students: abc
Invalid input

Case 4: File Error
File error occurred
*/