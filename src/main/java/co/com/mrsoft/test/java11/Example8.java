package co.com.mrsoft.test.java11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Example of new File APIs.
 */
public class Example8 {
    public static void main(String[] args) {
        try {
            // Create the file
            File tempFile = File.createTempFile("tempFile", ".tmp");

            // Write content to the file
            Path tempFilePath = Files.writeString(
                    Path.of(tempFile.toURI()),
                    "Hello world!!!",
                    Charset.defaultCharset(), StandardOpenOption.WRITE);

            // Read content from the file
            String fileContent = Files.readString(tempFilePath);

            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
