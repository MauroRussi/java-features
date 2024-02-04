# Java Features
Project to do some Java practices of new features per Java version.

## Java 8 Features
  <details>
    <summary style="font-size:1.2em;">Functional interfaces</summary>
    <p>
    It is an interface that has a SAM (Single Abstract Method).
    The <i>@FunctionalInterface</i> annotation is optional, however it prevents abstract methods from being
    accidentally added to functional interfaces.
    Default methods are not abstract and do not count; a functional interface may still have multiple
    default methods.
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example1.java">Example</a>
  </details>

  <details>
    <summary style="font-size:1.2em;">Default And Static Methods In Interfaces</summary>
    <p>
    Default Methods in Interfaces:
    These are non-abstract methods to interfaces. It allows you to create interfaces with
    method implementation. Lambda Expression functionality is mostly enabled through default approaches.
    </p>
    <p>
    Static Methods in Interfaces:
    It's a default method invoked as an static method call on the Interface.    
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example1.java">Example</a>
  </details>

  <details>
    <summary style="font-size:1.2em;">Standard Functional Interfaces</summary>
    <p>
    The recommendation is using these default functions located in <i>java.util.function</i> package.</br>
     - Function / BiFunction</br>
     - Supplier</br>
     - Consumer</br>
     - Predicates</br>
     - Unary / Binary Operator
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example2.java">Example</a>
  </details>  

  <details>
    <summary style="font-size:1.2em;">Lambda Expressions</summary>
    <p>
    Lambda Expressions:
    Lambda expressions provide the implementation of the abstract method of a functional interface.</br>
    An anonymous function may be defined as a Lambda Expression (or function) (a function with no name and an identifier).
    Lambda Expressions are defined precisely where they are required, often as a parameter to another function.</br>
    Lambda Expressions, on the other hand, express instances of Functional Interfaces from a different viewpoint.
    Lambda Expressions implement functional interfaces by implementing the single abstract function provided in the
    functional interface.</br></br>
    Important characteristics:</br>
    - Optional type declaration: No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.</br>
    - Optional parenthesis around parameter: No need to declare a single parameter in parentheses. For multiple parameters, parentheses are required.</br>
    - Optional curly braces: No need to use curly braces in expression body if the body contains a single statement.</br>
    - Optional return keyword: The compiler automatically returns the value if the body has a single expression to return the value.</br>
    - Curly braces are required to indicate that expression returns a value.
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example3.java">Example</a>
  </details>  

## Links for reference:
 * https://mkyong.com/tutorials/java-8-tutorials/
 * https://www.digitalocean.com/community/tutorials/java-8-features-with-examples
 * https://www.digitalocean.com/community/tutorials/java-11-features
 * https://mkyong.com/java/what-is-new-in-java-17/
 * https://www.baeldung.com/java-8-functional-interfaces
 * https://www.interviewbit.com/blog/java-8-features/
 * https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm