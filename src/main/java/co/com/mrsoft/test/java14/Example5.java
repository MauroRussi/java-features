package co.com.mrsoft.test.java14;

/**
 * Examples of text blocks new features.
 */
public class Example5 {
    public static void main(String[] args) {
        String html = "<html>\n" +
                "   <body>\n" +
                "      <p>Hello, World</p>\n" +
                "   </body>\n" +
                "</html>\n";

        String java13 = """
                        <html>
                            <body>
                                <p>Hello, World</p>
                            </body>
                        </html>
                        """;

        String java14 = """
                        <html>
                            <body>\
                                <p>Hello, '\s' World</p>\
                            </body>
                        </html>
                        """;

        System.out.println(html);
        System.out.println(java13);
        System.out.println(java14);
    }
}
