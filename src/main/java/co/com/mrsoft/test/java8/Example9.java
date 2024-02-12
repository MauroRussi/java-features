package co.com.mrsoft.test.java8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * Samples of Base64 encoder / decoder
 */
public class Example9 {
    public static void main(String[] args) {
        try {
            byte[] byteArray = "StringToEncode".getBytes("utf-8");

            // Declaration of encoder / decoder
            Base64.Encoder encoder = Base64.getEncoder();
            Base64.Decoder decoder = Base64.getDecoder();

            // Encode using basic encoder
            String base64BasicString = encoder.encodeToString(byteArray);
            System.out.println("Base64 Encoded String (Basic) :" + base64BasicString);

            // Encode using URL encoder
            String base64URLString = Base64.getUrlEncoder().encodeToString(byteArray);
            System.out.println("Base64 Encoded String (URL) :" + base64URLString);

            // Encode using MIME encoder
            String base64MIMEString = Base64.getMimeEncoder().encodeToString(byteArray);
            System.out.println("Base64 Encoded String (MIME) :" + base64MIMEString);

            // Decode using basic decoder
            byte[] base64DecodedBytes = decoder.decode(base64BasicString);
            System.out.println("Original String: " + new String(base64DecodedBytes, "utf-8"));
        }
        catch(UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
