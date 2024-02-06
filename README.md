# Java Features
Project to do some Java practices of new features per Java version.

## Java 8
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

  <details>
    <summary style="font-size:1.2em;">Method References</summary>
    <p>
    The double colon (::) operator is called method reference.
    There are four kind of method references:
    1. Reference to a static method ClassName::staticMethodName
    2. Reference to an instance method of a particular object Object::instanceMethodName
    3. Reference to an instance method of an arbitrary object of a particular type ContainingType::methodName–
    4. Reference to a constructor ClassName::new
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example4.java">Example</a>
  </details>  

  <details>
    <summary style="font-size:1.2em;">Lambda Expressions and Functional Interfaces: Tips and Best Practices</summary>
    <p>
    1. Prefer Standard Functional Interfaces before creating new functional interfaces.
    2. Use the @FunctionalInterface annotation.
    3. Don’t Overuse Default Methods in Functional Interfaces.
    4. Instantiate Functional Interfaces with Lambda Expresssions.
    5. Avoid overloading methods with Functional Interfaces as parameters.
    6. Don't treat Lambda Expressions as Inner Classes.
    7. Keep Lambda Expresssions short and self-explanatory.
        7.1. Avoid blocks of code in Lambda's body.
        7.2. Avoid specifying parameter types.
        7.3. Avoid parentheses around a single parameter.
        7.4. Avoid return statements and braces.
        7.5. Use Method References.
    8. Use "Effectively Final" variables.
    9. Protect Object variables from Mutation - Avoid code that can cause unexpected mutations.
  </details>

  <details>
    <summary style="font-size:1.2em;">Streams</summary>
    <p>
    A new <i>java.util.stream</i> has been added in Java 8 to perform filter/map/reduce like operations with the collection. 
    Stream API will allow sequential as well as parallel execution.
    Stream represents a sequence of objects from a source, which supports aggregate operations. Following are the 
    characteristics of a Stream:
    * Sequence of elements: A stream provides a set of elements of specific type in a sequential manner. 
      A stream gets/computes elements on demand. It never stores the elements.
    * Source: Stream takes Collections, Arrays, or I/O resources as input source.
    * Aggregate operations: Stream supports aggregate operations like filter, map, limit, reduce, find, match, and so on.
    * Pipelining: Most of the stream operations return stream itself so that their result can be pipelined. These operations 
                  are called intermediate operations and their function is to take input, process them, and return output to 
                  the target. 
    * Collectors: collect() method is a terminal operation which is normally present at the end of the pipelining operation 
                  to mark the end of the stream.
    * Automatic iterations: Stream operations do the iterations internally over the source elements provided, in contrast to 
                            Collections where explicit iteration is required.
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example5.java">Example</a>
  </details>  

  <details>
    <summary style="font-size:1.2em;">New Date Time APIs</summary>
    <p>
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example4.java">Example</a>
  </details>  

  <details>
    <summary style="font-size:1.2em;">Optional Class</summary>
    <p>
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example4.java">Example</a>
  </details>

  <details>
    <summary style="font-size:1.2em;">Nashorn Javascript</summary>
    <p>
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example4.java">Example</a>
  </details>  

  <details>
    <summary style="font-size:1.2em;">Base64</summary>
    <p>
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example4.java">Example</a>
  </details>  

  <details>
    <summary style="font-size:1.2em;">Collection | Concurrency | Java IO | Miscellaneous improvements</summary>
    <p>
    </p>
    <a href="src/main/java/co/com/mrsoft/test/java8/Example4.java">Example</a>
  </details>  


## Java 8 - Links for reference:
 * https://mkyong.com/tutorials/java-8-tutorials/
 * https://www.digitalocean.com/community/tutorials/java-8-features-with-examples
 * https://www.baeldung.com/java-8-functional-interfaces
 * https://www.interviewbit.com/blog/java-8-features/
 * https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm
 * https://www.digitalocean.com/community/tutorials/java-11-features
 * https://mkyong.com/java/what-is-new-in-java-17/
