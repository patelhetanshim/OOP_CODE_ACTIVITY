import java.util.*;

public class c32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> rollList = new LinkedList<>();
        System.out.print("Enter number of roll numbers: ");
        int n1 = sc.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.print("Enter roll number " + i + ": ");
            rollList.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        boolean foundRoll = searchElement(rollList, searchRoll);
        System.out.println("Roll number found: " + foundRoll);

        sc.nextLine();

        LinkedList<String> nameList = new LinkedList<>();
        System.out.print("\nEnter number of names: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n2; i++) {
            System.out.print("Enter name " + i + ": ");
            nameList.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean foundName = searchElement(nameList, searchName);
        System.out.println("Name found: " + foundName);

        sc.close();
    }
}

/*
Output:
Enter number of roll numbers: 3
Enter roll number 1: 23
Enter roll number 2: 45
Enter roll number 3: 67
Enter roll number to search: 12
Roll number found: false

Enter number of names: 2
Enter name 1: hetu
Enter name 2: bhumi
Enter name to search: srushti
Name found: false

Enter number of roll numbers: 3
Enter roll number 1: 22
Enter roll number 2: 11
Enter roll number 3: 33
Enter roll number to search: 22
Roll number found: true

Enter number of names: 3
Enter name 1: hetu
Enter name 2: sru
Enter name 3: bhumi
Enter name to search: hetu
Name found: true
*/