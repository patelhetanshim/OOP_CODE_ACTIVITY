import java.util.*;

public class c29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nMarks List:");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("\nHighest Marks: " + max);
        System.out.println("Lowest Marks: " + min);

        sc.close();
    }
}
/* 
Enter number of students: 5
Enter marks for student 1: 23
Enter marks for student 2: 88
Enter marks for student 3: 87
Enter marks for student 4: 45
Enter marks for student 5: 34

Marks List:
23 88 87 45 34 
Highest Marks: 88
Lowest Marks: 23
 */