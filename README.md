<!-- markdownlint-configure-file {
  "MD013": {
    "code_blocks": false,
    "tables": false
  },
  "MD033": false,
  "MD041": false
} -->

# Java Features
Project to do some Java practices and summarize the new features per Java version since Java 8.

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
    
   > Optional is a container object used to contain not-null objects.
   > 
   > Optional object is used to represent null with absent value. 
   > 
   > This class has various utility methods to facilitate code to handle values as ‘available’ or 
   > ‘not available’ instead of checking null values.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example8.java)
  </details>

  <details>
   <summary>Base 64</summary>

   > For Base64 encoding, Java 8 has built-in encode and decode functions.
   > 
   > The Base64 encoding class in `java.util.Base64`.
   >
   > Three Base64 encoders and decoders are provided in this class:
   > - Simple: The output is mapped to a set of characters between `A-Za-z0-9+/`. 
   >   The encoder does not add a line feed to the output, and the decoder rejects any character other than the above.
   > - URL: Output is mapped to set of characters between `A-Za-z0-9+_`. Output is URL and filename safe. 
   > - MIME: The output of this sort of encoder is mapped to a MIME-friendly format. Output is represented in lines of no
   >   more than 76 characters each, and uses a carriage return `\r` followed by a linefeed `\n` as the line separator.
   >   No line separator is present to the end of the encoded output.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java8/Example9.java)
  </details>  

  <details>
   <summary>Collection API improvements</summary>

   > Some new methods added in Collection API are:
   > - `Iterator` default method `forEachRemaining(Consumer action)` to perform the given action for each remaining element until all elements have been processed or the action throws an exception.
   > - `Collection` default method `removeIf(Predicate filter)` to remove all of the elements of this collection that satisfy the given predicate.
   > - `Collection` `spliterator()` method returning `Spliterator` instance that can be used to traverse elements sequentially or parallel.
   > - Map `replaceAll()`, `compute()`, `merge()` methods.
   > - Performance Improvement for `HashMap` class with Key Collisions
  </details>  

  <details>
   <summary>Concurrency API improvements</summary>

   > Some important concurrent API enhancements are:
   > - `ConcurrentHashMap` `compute()`, `forEach()`, `forEachEntry()`, `forEachKey()`, `forEachValue()`, `merge()`, `reduce()` and `search()` methods.
   > - `CompletableFuture` that may be explicitly completed (setting its value and status).
   > - `Executors` `newWorkStealingPool()` method to create a work-stealing thread pool using all available processors as its target parallelism level.
  </details>  

  <details>
   <summary>Java IO improvements</summary>

   > Some IO improvements are:
   > - `Files.list(Path dir)` that returns a lazily populated `Stream`, the elements of which are the entries in the directory.
   > - `Files.lines(Path path)` that reads all lines from a file as a `Stream`.
   > - `Files.find()` that returns a `Stream` that is lazily populated with `Path` by searching for files in a file tree rooted at a given starting file.
   > - `BufferedReader.lines()` that return a `Stream`, the elements of which are lines read from this `BufferedReader`.
  </details>

  <details>
   <summary>Miscellaneous improvements</summary>

   > Some miscellaneous API improvements are:
   > - `ThreadLocal` static method `withInitial(Supplier supplier)` to create instances easily.
   > - The `Comparator` interface has been extended with a lot of default and static methods for natural ordering, reverse order, etc.
   > - `min()`, `max()` and `sum()` methods in `Integer`, `Long` and `Double` wrapper classes.
   > `logicalAnd()`, `logicalOr()` and `logicalXor()` methods in `Boolean` class.
   > `ZipFile.stream()` method to get an ordered `Stream` over the ZIP file entries. Entries appear in the `Stream` in the order they appear in the central directory of the ZIP file.
   > - Several utility methods in Math class.
   > - `jjs` command is added to invoke Nashorn Javascript Engine which was introduced to replace the existing Rhino.
   > - `jdeps` command is added to analyze class files
   > - JDBC-ODBC Bridge has been removed.
   > - PermGen memory space has been removed
  </details>

## Java 9
  <details>
   <summary>Module System</summary>

   > Module is an abstraction over package. This module system is also known as JPMS (Java Platform Module System).
   > It is a new kind of programming component which can contains packages, configurations, resources specific to a particular functionality. 
   > A module is able to restrict access to packages it contains. By default, code in a package within a module is not visible to outside world, not even via reflection. 
   > Java platform is itself modularised from java 9 onwards. 
   > 
   > If we use the `list-modules` command to list the java modules, it will print the various modules java supports.
   > 
   > **Features of Java Module System**
   > 
   > - A new optional phase, link time is introduced. This phase is in-between compile time and run time. During this phase, a set of modules can be assembled and optimized, making a custom runtime image using jlink tool.
   > - javac, jlink, and java have additional options to specify module paths, which further locate definitions of modules.
   > - JAR format updated as modular JAR, which contains module-info.class file in its root directory.
   > - JMOD format introduced, a packaging format (similar to JAR) which can include native code and configuration files.
   > 
   >  **Declaring a Module**
   > 
   > In order to declare a module, we need to create a `module-info.java` in root folder of the application. 
   > 
   > This file contains all the meta data or module descriptions.
   > 
   > [Example](src/main/java/module-info.java)

  </details>

  <details>
   <summary>REPL (JShell)</summary>

   > REPL stands for Read Evaluate Print Loop. JShell was introduced in Java 9 which is an interactive console. 
   > 
   > JShell as REPL allows to run arbitrary snippet of java code in console without need to save and compile java code file. 
   > 
   > JShell reads each line entered, evaluates it and then print the result and then again becomes ready for next set of input.
   > 
   > In order to run it, open a command prompt and type `jshell`
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/jshell.md)

  </details>

  <details>
   <summary>Improved Javadocs</summary>

   > Trraditional `javadoc` command generates documentation in html 4.0 format.
   > 
   > Since Java 9, we can generate documentation in html 5 format using `-html5` option in command line argument.
   > 
   > To test it, create a temporary folder in the root of the project and go inside it, then execute the following commands: 
   > - HTML 4: `javadoc -d . ../src/main/java/co/com/mrsoft/test/java9/Example1.java`
   > - HTML 5: `javadoc -d . -html5 ../src/main/java/co/com/mrsoft/test/java9/Example1.java`

  </details>

  <details>
   <summary>Multirelease Jar</summary>

   > It allows to use of multiple versions of a class pertaining to multiple versions of Java. It helps to counter 
   > the problem of maintenance of multiple source codes of the same file or platform-specific version of a file.
   > 
   > In multi-release Jar, the `MANIFEST.MF` file has an entry `Multi-Release: true` in its main section.
   > `META-INF` directory also contains a versions subdirectory whose subdirectories store version-specific classes and resource files.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/multirelease.md)

  </details>

  <details>
   <summary>Collection Factory Methods</summary>

   > In Java 9, collections were enhanced to have few new methods to create
   > immutable list in an easy and concise way. 
   > 
   > These new factory methods were added to `List`, `Set`, and `Map` interfaces to 
   > create immutable instances. 
   > 
   > These factory methods are mainly convenience factory methods in order to create 
   > a collection in less verbose and in concise way.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example2.java)

  </details>

  <details>
   <summary>Private Interface Methods</summary>

   > Interfaces can have `private static` methods, which can be used to split lengthy `default` methods.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example3.java)

  </details>

  <details>
   <summary>Process API improvements</summary>

   > Process API which is responsible to control and manage operating system processes has been improved considerably. 
   > 
   > `ProcessHandle` Class now provides:
   > - Process's native process ID
   > - Start time
   > - Accumulated CPU time
   > - Arguments
   > - Command
   > - User
   > - Parent process and descendants 
   > 
   > `ProcessHandle` class also provides method to check processes' liveness and to destroy processes. 
   > 
   > It has `onExit` method, the `CompletableFuture` class can perform action asynchronously when process exits.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example4.java)

  </details>

  <details>
   <summary>Stream API improvements</summary>

   > There are new methods to make streams better:
   >  - `default Stream<T> takeWhile(Predicate<? super T> predicate)`
   >    * `takeWhile` takes all the values until the predicate returns false.
   >  - `default Stream<T> dropWhile(Predicate<? super T> predicate)`
   >    * `dropWhile` method throw away all the values at the start until the predicate returns true.
   >  - `static <T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)`
   >    * `iterate` method now has hasNext predicate as parameter which stops the loop once hasNext predicate returns false.
   >  - `static <T> Stream<T> ofNullable(T t)`   
   >    * `ofNullable` method is introduced to prevent `NullPointerExceptions` and to avoid null checks for streams. This method returns a sequential `Stream` containing single element, if non-null, otherwise returns an empty Stream.
   >  
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example5.java)

  </details>

  <details>
   <summary>Try With Resources improvement</summary>

   > The `try-with-resources` statement ensures that each resource is closed after the requirement finishes. 
   > Any object implementing `java.lang.AutoCloseable` or `java.io.Closeable`, interface can be used as a resource.
   > 
   > Prior to Java 9, the `try-with-resources` syntax requires a fresh variable to be declared for each resource 
   > being managed by the statement. Java 9 is going to provide some improvements to this statement to avoid 
   > some more verbosity and improve some Readability.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example6.java)

  </details>

  <details>
   <summary>Enhanced @Deprecated annotation</summary>

   > Two new enhancements are made to `@Deprecated` annotation:
   >  - `forRemoval` attribute indicates whether the annotated element is subject to removal in a future version. 
   > The default value is `false`.
   >  - `since` attribute returns the version in which the annotated element became deprecated. 
   > The default value is the empty string.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example1.java)

  </details>

  <details>
   <summary>Inner Class Diamond Operator</summary>

   > The diamond operator was introduced in Java 7 to make code more readable for `Generics`. A generic is a type of argument. 
   > Using generic we can pass any kind of object to be processed by the class methods. 
   > 
   > For example, if we are creating a list of strings before Java 7, then we've to use the following syntax to instantiate a list of strings with an `ArrayList` object.
   > ``` java
   > List<String> listOfStrings = new ArrayList<String>();
   > ``` 
   > 
   > From Java 7 onwards, we can use diamond operator to simplify the above syntax as following
   > ``` java
   > List<String> listOfStrings = new ArrayList<>();
   > ``` 
   > 
   > But it could not be used with Anonymous inner classes.
   > 
   > In Java 9, the diamond operator can be used with an anonymous class as well to simplify code and improve readability.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example7.java)

  </details>

  <details>
   <summary>Optional Class improvements</summary>

   > Java 9 has added a stream method. 
   > 
   > If a value is present in the given Optional object, this stream() method returns a sequential Stream with that value. 
   > Otherwise, it returns an empty Stream. 
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example8.java)

  </details>

  <details>
   <summary>Multiresolution Image API</summary>

   > 
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example1.java)

  </details>

  <details>
   <summary>CompletableFuture API improvements</summary>

   > 
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example1.java)

  </details>

  <details>
   <summary>Lightweight JSON</summary>

   > 
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example1.java)

  </details>

  <details>
   <summary>Reactive Streams API</summary>

   > 
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example1.java)

  </details>

  <details>
   <summary>Miscellaneous features</summary>

   > 
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example1.java)

  </details>

## Links for reference
### Java 8
 * https://mkyong.com/tutorials/java-8-tutorials/
 * https://www.digitalocean.com/community/tutorials/java-8-features-with-examples
 * https://www.baeldung.com/java-8-functional-interfaces
 * https://www.interviewbit.com/blog/java-8-features/
 * https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm

### Java 9
 * https://www.tutorialspoint.com/java9/index.htm
 * https://www.digitalocean.com/community/tutorials/java-9-features-with-examples
 * https://www.interviewbit.com/blog/java-9-features/
 * https://www.baeldung.com/new-java-9
 
### Java 11
 * https://www.digitalocean.com/community/tutorials/java-11-features
 * https://mkyong.com/java/what-is-new-in-java-11/

### Java 17
 * https://mkyong.com/java/what-is-new-in-java-17/
