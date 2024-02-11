<!-- markdownlint-configure-file {
  "MD013": {
    "code_blocks": false,
    "tables": false
  },
  "MD033": false,
  "MD041": false
} -->

# Java Features
Project to do some Java practices of new features per Java version.

## Java 8
  <details>
   <summary>Functional interfaces</summary>

   > It is an interface that has a SAM (Single Abstract Method).
   > 
   > The `@FunctionalInterface` annotation is optional, however it prevents abstract methods from being
   > accidentally added to functional interfaces.
   > 
   > Default methods are not abstract and do not count; a functional interface may still have multiple
   > default methods.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example1.java)

  </details>

  <details>
   <summary>Default And Static Methods In Interfaces</summary>

   > **Default Methods in Interfaces:**
   > 
   > These are non-abstract methods to interfaces. It allows you to create interfaces with
   > method implementation. 
   >
   > Lambda Expression functionality is mostly enabled through default approaches.
   > 
   > **Static Methods in Interfaces:**
   > 
   > It's a default method invoked as an static method call on the Interface.    
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example1.java)

  </details>

  <details>
   <summary>Standard Functional Interfaces</summary>
    
   > The recommendation is using these default functions located in `java.util.function` package.
   >  - Function / BiFunction
   >  - Supplier
   >  - Consumer
   >  - Predicates
   >  - Unary / Binary Operator
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example2.java)

  </details>  

  <details>
   <summary>Lambda Expressions</summary>

   > Lambda expressions provide the implementation of the abstract method of a functional interface.
   >
   > An anonymous function may be defined as a Lambda Expression (or function) (a function with no name and an identifier).
   >
   > Lambda Expressions are defined precisely where they are required, often as a parameter to another function.
   >
   > Lambda Expressions, on the other hand, express instances of Functional Interfaces from a different viewpoint.
   >
   > Lambda Expressions implement functional interfaces by implementing the single abstract function provided in the
   > functional interface.
   >
   > Important characteristics:
   >  - Optional type declaration
   >    * No need to declare the type of a parameter. 
   >    * The compiler can inference the same from the value of the parameter.
   >  - Optional parenthesis around parameter
   >    * No need to declare a single parameter in parentheses. 
   >    * For multiple parameters, parentheses are required.
   >  - Optional curly braces
   >    * No need to use curly braces in expression body if the body contains a single statement.
   >  - Optional return keyword
   >    * The compiler automatically returns the value if the body has a single expression to return the value.
   >  - Curly braces are required to indicate that expression returns a value.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example3.java)
  </details>  

  <details>
   <summary>Method References</summary>
   
   > The double colon (::) operator is called method reference.
   > There are four kind of method references:
   > 1. Reference to a static method `ClassName::staticMethodName`
   > 2. Reference to an instance method of a particular object `Object::instanceMethodName`
   > 3. Reference to an instance method of an arbitrary object of a particular type `ContainingType::methodName–`
   > 4. Reference to a constructor `ClassName::new`
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example4.java)
  </details>  

  <details>
   <summary>Lambda Expressions and Functional Interfaces: Tips and Best Practices</summary>

   > 1. Prefer Standard Functional Interfaces before creating new functional interfaces.
   > 2. Use the `@FunctionalInterface` annotation.
   > 3. Don’t Overuse Default Methods in Functional Interfaces.
   > 4. Instantiate Functional Interfaces with Lambda Expresssions.
   > 5. Avoid overloading methods with Functional Interfaces as parameters.
   > 6. Don't treat Lambda Expressions as Inner Classes.
   > 7. Keep Lambda Expresssions short and self-explanatory.
   >
   >     7.1. Avoid blocks of code in Lambda's body.
   >
   >     7.2. Avoid specifying parameter types.
   >
   >     7.3. Avoid parentheses around a single parameter.
   >
   >     7.4. Avoid return statements and braces.
   >
   >     7.5. Use Method References.
   > 8. Use "Effectively Final" variables.
   > 9. Protect Object variables from Mutation - Avoid code that can cause unexpected mutations.
  </details>

  <details>
   <summary>For Each</summary>
    
   > Java 8 has introduced a default method named `forEach` in `java.lang.Iterable` interface that can iterate over the collection's items.
   >
   > The `forEach` method takes `java.util.function.Consumer` object as an argument
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example6.java)
  </details>


  <details>
   <summary>Streams</summary>

   > A new `java.util.stream` has been added in Java 8 to perform filter/map/reduce like operations with the collection. 
   > Stream API will allow sequential as well as parallel execution.
   >
   > Stream represents a sequence of objects from a source, which supports aggregate operations. Following are the 
   > characteristics of a Stream:
   > - Sequence of elements
   >   * A stream provides a set of elements of specific type in a sequential manner. 
   >   * A stream gets/computes elements on demand. It never stores the elements.
   > - Source
   >   * Stream takes Collections, Arrays, or I/O resources as input source.
   > - Aggregate operations
   >   * Stream supports aggregate operations like filter, map, limit, reduce, find, match, and so on.
   > - Pipelining
   >   * Most of the stream operations return stream itself so that their result can be pipelined. 
   >   * These operations are called intermediate operations and their function is to take input, process them, and return output to the target. 
   > - Collectors
   >   * `collect()` method is a terminal operation which is normally present at the end of the pipelining operation to mark the end of the stream.
   > - Automatic iterations
   >   * Stream operations do the iterations internally over the source elements provided, in contrast to Collections where explicit iteration is required.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example5.java)
  </details>

  <details>
   <summary>New Date Time APIs</summary>
    
   > In the old days, we use `Date` and `Calendar` APIs to represent and manipulate date.
   >
   > - `java.util.Date` – Date and time, print with default time-zone.
   > - `java.util.Calendar` – Date and time, more methods to manipulate date.
   > - `java.text.SimpleDateFormat` – Formatting (date -> text), parsing (text -> date) for date and calendar.
   >
   > Java 8 created a series of new date and time APIs in `java.time` package.
   > - `java.time.LocalDate` – Date without time, no time-zone. Default format is yyyy-MM-dd.
   > - `java.time.LocalTime` – Time without date, no time-zone. Default format is HH:mm:ss.zzz.
   > - `java.time.LocalDateTime` – Date and time, no time-zone. Default format is yyyy-MM-ddTHH:mm:ss.zzz.
   > - `java.time.ZonedDateTime` – date and time, with time-zone.
   > - `java.time.Instant` – date and time for machine, seconds passed since the Unix epoch time (midnight of January 1, 1970 UTC)
   > - `java.time.Duration` – Measures time in seconds and nanoseconds.
   > - `java.time.Period` – Measures time in years, months and days.
   > - `java.time.temporal.TemporalAdjuster` – Adjust a date or Temporal.
   > - `java.time.OffsetDateTime` – A date-time with an offset from UTC/Greenwich.
   > - `java.time.DateTimeFormatter` – Formatting (date -> text), parsing (text -> date) for java.time.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example7.java)
  </details>  

  <details>
   <summary>Optional Class</summary>
    
   >
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example4.java)
  </details>

  <details>
   <summary>Nashorn Javascript</summary>
    
   >
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example4.java)
  </details>  

  <details>
   <summary>Base 64</summary>
    
   >
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example4.java)
  </details>  

  <details>
   <summary>Collection | Concurrency | Java IO | Miscellaneous improvements</summary>
    
   >
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example4.java)
  </details>  

## Java 8 - Links for reference:
 * https://mkyong.com/tutorials/java-8-tutorials/
 * https://www.digitalocean.com/community/tutorials/java-8-features-with-examples
 * https://www.baeldung.com/java-8-functional-interfaces
 * https://www.interviewbit.com/blog/java-8-features/
 * https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm
 * https://www.digitalocean.com/community/tutorials/java-11-features
 * https://mkyong.com/java/what-is-new-in-java-17/
