package co.com.mrsoft.test.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Examples of new Files APIs.
 */
public class Example3 {
    public static void main(String[] args) throws IOException {
        // Create two files in temp directory
        Path path1 = Files.createTempFile("file1", ".txt");
        Path path2 = Files.createTempFile("file2", ".txt");

        // Write same content to both the files
        Files.writeString(path1, "ABCDEF123456");
        Files.writeString(path2, "ABCDEF123456");

        // Files.mismatch() - Check files for Mismatch, being same content, it should return -1.
        long mismatch = Files.mismatch(path1, path2);

        // Print the message based on mismatch result
        if(mismatch > 1L) {
            System.out.println("Mismatch occurred in file1 and file2 at : " + mismatch);
        } else {
            System.out.println("Files matched");
        }

        // Delete the files
        path1.toFile().deleteOnExit();
        path2.toFile().deleteOnExit();
    }
}
