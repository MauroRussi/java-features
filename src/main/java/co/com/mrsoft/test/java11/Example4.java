package co.com.mrsoft.test.java11;

import javax.crypto.*;
import javax.crypto.spec.ChaCha20ParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Examples of ChaCha20 and Poly1305 cryptographic algorithms.
 */
public class Example4 {
    // Encryption of an String using ChaCha20 algorithm.
    private static String encryptChaCha20(String text) throws NoSuchPaddingException, NoSuchAlgorithmException,
                                                              InvalidAlgorithmParameterException, InvalidKeyException,
                                                              IllegalBlockSizeException, BadPaddingException {
        var nonce = getNonce();
        var key = getKey();
        var counter = 1;

        Cipher cipher = Cipher.getInstance("ChaCha20");
        ChaCha20ParameterSpec params = new ChaCha20ParameterSpec(nonce, counter);

        cipher.init(Cipher.ENCRYPT_MODE, key, params);
        return new String(cipher.doFinal(text.getBytes()));
    }

    // Encryption of an String using ChaCha20-Poly1305 algorithm.
    private static String encryptChaCha20Poly1305(String text) throws NoSuchPaddingException, NoSuchAlgorithmException,
                                                                    InvalidAlgorithmParameterException, InvalidKeyException,
                                                                    IllegalBlockSizeException, BadPaddingException {
        var nonce = getNonce();
        var key = getKey();
        var counter = 1;

        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305");
        IvParameterSpec iv = new IvParameterSpec(nonce);

        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        return new String(cipher.doFinal(text.getBytes()));
    }

    // 96-bit nonce (12 bytes)
    private static byte[] getNonce() {
        byte[] newNonce = new byte[12];
        new SecureRandom().nextBytes(newNonce);
        return newNonce;
    }

    // A 256-bit secret key (32 bytes)
    private static SecretKey getKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("ChaCha20");
        keyGen.init(256, SecureRandom.getInstanceStrong());
        return keyGen.generateKey();
    }

    public static void main(String[] args) throws InvalidAlgorithmParameterException, NoSuchPaddingException,
                                                  IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException,
                                                  InvalidKeyException {
        var textToEncrypt = "Hello world!";

        System.out.println("ChaCha20 encryption: " + encryptChaCha20(textToEncrypt));
        System.out.println("ChaCha20-Poly1305 encryption: " + encryptChaCha20Poly1305(textToEncrypt));
    }
}
