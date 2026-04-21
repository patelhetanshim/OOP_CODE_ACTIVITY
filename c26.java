import java.io.*;

public class c26 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file name as command-line argument");
            return;
        }

        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    wordCount += words.length;
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
/*
Output:

PS C:\Users\HETANSHI\OneDrive\ドキュメント\Desktop\activity\pratical> javac c26.java
PS C:\Users\HETANSHI\OneDrive\ドキュメント\Desktop\activity\pratical> java c26 sample.txt
Lines: 3
Words: 12
Characters: 68
PS C:\Users\HETANSHI\OneDrive\ドキュメント\Desktop\activity\pratical>
*/