package co.com.mrsoft.test.java15;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

/**
 * Examples of EdDSA digital signature algorithms.
 */
public class Example1 {
    public static void main(String[] args)
            throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        // Gets the KeyPairGenerator.
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("Ed25519");

        // Generates the key pair.
        KeyPair kp = kpg.generateKeyPair();

        //Gets the message in bytes.
        byte[] msg = "abc".getBytes(StandardCharsets.UTF_8);

        // Instance the Signature and sign the message.
        Signature sig = Signature.getInstance("Ed25519");
        sig.initSign(kp.getPrivate());
        sig.update(msg);
        byte[] s = sig.sign();

        // Prints the signature
        System.out.println(Base64.getEncoder().encodeToString(s));
    }
}
