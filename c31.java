import java.util.*;

public class c31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter song " + i + ": ");
            playlist.add(sc.nextLine());
        }

        System.out.println("\nFull Playlist:");
        System.out.println(playlist);

        if (!playlist.isEmpty()) {
            System.out.println("\nPlaying first song: " + playlist.removeFirst());
            System.out.println("Playlist after playing first song:");
            System.out.println(playlist);
        }

        if (!playlist.isEmpty()) {
            System.out.println("\nSkipping last song: " + playlist.removeLast());
            System.out.println("Playlist after skipping last song:");
            System.out.println(playlist);
        }

        sc.close();
    }
}

/*
Output:

Enter number of songs: 3
Enter song 1: sahiba
Enter song 2: saiyara
Enter song 3: khat

Full Playlist:
[sahiba, saiyara, khat]

Playing first song: sahiba
Playlist after playing first song:
[saiyara, khat]

Skipping last song: khat
Playlist after skipping last song:
[saiyara]
*/