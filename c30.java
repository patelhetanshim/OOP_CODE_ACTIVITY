import java.util.*;

public class c30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String words[] = input.trim().split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}

/*
Output:

Enter a sentence: hetanshi mayur patel hetu mayur patel nimisha mayur patel

Word Frequency:
patel -> 3
hetanshi -> 1
hetu -> 1
nimisha -> 1
mayur -> 3
*/