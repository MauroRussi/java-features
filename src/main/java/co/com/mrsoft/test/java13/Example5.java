package co.com.mrsoft.test.java13;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Examples of DOM and SAX Factories with Namespace Support.
 */
public class Example5 {
    public static void main(String[] args) throws ParserConfigurationException {
        // Before Java 13
        DocumentBuilderFactory oldDbf = DocumentBuilderFactory.newDefaultInstance();
        oldDbf.setNamespaceAware(true);
        DocumentBuilder oldDb = oldDbf.newDocumentBuilder();

        // Now Java 13
        DocumentBuilderFactory newDbf = DocumentBuilderFactory.newDefaultNSInstance();
        DocumentBuilder newDb = newDbf.newDocumentBuilder();
    }
}
