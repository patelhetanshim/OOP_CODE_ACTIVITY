import java.io.*;

public class c28 {
    public static void main(String[] args) {
        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    wordCount += words.length;

                charCount += line.replaceAll("\\s", "").length();
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces & newline): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}

/*
Output:

Case 1: File exists (data.txt content)
Hello World
Java is fun
File handling example

Lines: 3
Words: 8
Characters (excluding spaces & newline): 43

Case 2: File not found
File not found

Case 3: Read error
Error reading file
*/