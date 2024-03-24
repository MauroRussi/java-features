package co.com.mrsoft.test.java13;

/**
 * Examples of new String APIs.
 */
public class Example4 {
    public static void main(String[] args) {
        // String.formatted() - Format for text blocks
        String textBlock = """
			    Name: %s
			    Phone: %d
			    Salary: $%.2f
			    """;
        String output = textBlock.formatted("Andres", 123456789, 2000.5555);
        System.out.println(output);

        // String.stripIndent() - Removes white spaces
        String htmlTextBlock = "<html>   \n"+
                "\t<body>\t\t \n"+
                "\t\t<p>Hello</p>  \t \n"+
                "\t</body> \n"+
                "</html>";
        String stripped = htmlTextBlock.stripIndent();
        System.out.println(htmlTextBlock.replace(" ", "*"));
        System.out.println(stripped.replace(" ", "*"));

        // String.translateEscapes() - Translate escape sequences.
        String str1 = "Hi\t\nHello' \" /u0022 Pankaj\r";
        System.out.println(str1);
        System.out.println(str1.translateEscapes());
    }
}
