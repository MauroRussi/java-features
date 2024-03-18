package co.com.mrsoft.test.java11;

import java.security.*;
import java.security.spec.NamedParameterSpec;

/**
 * Example of new elliptic curve Diffie-Hellman (ECDH) scheme.
 */
public class Example2 {
    public static void main(String[] args)
            throws NoSuchAlgorithmException, InvalidAlgorithmParameterException
    {
        // Generating keys for specific algorithm
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("XDH");
        NamedParameterSpec paramSpec = new NamedParameterSpec("X25519");
        kpg.initialize(paramSpec); // equivalent to kpg.initialize(255)
        // alternatively: kpg = KeyPairGenerator.getInstance("X25519")
        KeyPair kp = kpg.generateKeyPair();

        // Public key information
        System.out.println("--- Public Key ---");
        PublicKey publicKey = kp.getPublic();
        System.out.println(publicKey.getAlgorithm());   // XDH
        System.out.println(publicKey.getFormat());      // X.509

        // Save this public key
        byte[] pubKey = publicKey.getEncoded();

        // Private key information
        System.out.println("--- Private Key ---");
        PrivateKey privateKey = kp.getPrivate();
        System.out.println(privateKey.getAlgorithm());  // XDH
        System.out.println(privateKey.getFormat());     // PKCS#8

        // Save this private key
        byte[] priKey = privateKey.getEncoded();
    }
}
