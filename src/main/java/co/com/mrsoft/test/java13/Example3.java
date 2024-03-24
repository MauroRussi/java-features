package co.com.mrsoft.test.java13;

/**
 * Examples of Text Blocks.
 */
public class Example3 {
    public static void main(String[] args) {
        // Before Java 13
        String htmlOld ="<html>\n" +
                "   <body>\n" +
                "      <p>Hello, World</p>\n" +
                "   </body>\n" +
                "</html>\n";


        String jsonOld ="{\n" +
                "   \"name\":\"mkyong\",\n" +
                "   \"age\":38\n" +
                "}\n";

        System.out.println("Before Java13: " + htmlOld);
        System.out.println("Before Java13: " + jsonOld);

        // Now Java 13
        String htmlNew =  """
                <html>
                    <body>
                        <p>Hello, World</p>
                    </body>
                </html>
				        """;

        String jsonNew = """
                {
                    "name":"mkyong",
                    "age":38
                }
                """;

        System.out.println("Java13: " + htmlNew);
        System.out.println("Java13: " + jsonNew);
    }
}
