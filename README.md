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
  #### Long-term support version / Class file version 52 / Release date 18th March 2014

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
  #### Feature release / Class file version 53 / Release date 21st September 2017

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

   > The interface `java.awt.image.MultiResolutionImage` encapsulates a set of images with different resolutions into a single object. 
   > 
   > We can retrieve a resolution-specific image variant based on a given DPI metric and set of image transformations or retrieve all of the variants in the image.
   > 
   > The `java.awt.Graphics` class gets variant from a multi-resolution image based on the current display DPI metric and any applied transformations.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example9.java)

  </details>

  <details>
   <summary>New Http Client</summary>

   > A new HTTPClient API supporting websockets and HTTP 2 streams and server push features located under the java.net.http package.
   > A long-awaited replacement of the old HttpURLConnection.
   > 
   > The new HTTP client API implements the following:
   >  - An easy and compact API to deal with most HTTP requests
   >  - Support for HTTP/2 specification
   >  - Better performance
   >  - Better security
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example9.java)

  </details>

  <details>
   <summary>CompletableFuture API improvements</summary>

   > There is an improvement in the `CompletableFuture` API that solve some problems raised in Java SE 8. 
   > 
   > Following are the relevant changes done to the API:
   >  - Support for delays and timeouts
   >    ``` java
   >    // This method completes this CompletableFuture with the given value if not otherwise completed before the given timeout.
   >    public CompletableFuture<T> completeOnTimeout(T value, long timeout, TimeUnit unit)
   > 
   >    // This method exceptionally completes this CompletableFuture with a TimeoutException if not otherwise 
   >    // completed before the given timeout.   
   >    public CompletableFuture<T> orTimeout(long timeout, TimeUnit unit)
   >    ``` 
   >  - Improved support for subclassing
   >    ``` java
   >    // It returns the default Executor used for async methods that do not specify an Executor. 
   >    // This method may be overridden in subclasses to return an Executor to provide one independent thread as minimum.
   >    public Executor defaultExecutor()
   > 
   >    // Returns a new incomplete CompletableFuture of the type to be returned by a CompletionStage method. 
   >    // Subclasses of CompletableFuture class should override this method to return an instance of the same class 
   >    // as this CompletableFuture. 
   >    // The default implementation returns an instance of class CompletableFuture.
   >    public <U> CompletableFuture<U> newIncompleteFuture()
   >    ``` 
   >  - New factory methods added
   >    ``` java   
   >    // This factory method returns a new CompletableFuture which is already completed with the given value.
   >    public static <U> CompletableFuture<U> completedFuture(U value)
   > 
   >    // This factory method returns a new CompletionStage which is already completed with the given value 
   >    // and supports only those methods present in interface CompletionStage.
   >    public static <U> CompletionStage<U> completedStage(U value)
   >
   >    // This factory method returns a new CompletionStage which is already completed exceptionally with the 
   >    // given exception and supports only those methods present in interface CompletionStage.
   >    public static <U> CompletionStage<U> failedStage(Throwable ex)
   >    ```
   > 

  </details>

  <details>
   <summary>Reactive Streams API</summary>

   > Reactive Streams is a standard for asynchronous stream processing with non-blocking back pressure. 
   > 
   > This specification is defined in the [Reactive Manifesto](http://www.reactive-streams.org), and there are various implementations of it, 
   > for example, RxJava or Akka-Streams.

   > To build a `Flow`, we can use three main abstractions and compose them into asynchronous processing logic.
   > 
   > Every `Flow` needs to process events that are published to it by a `Publisher` instance; the `Publisher` has one method – `subscribe()`.
   >
   > If any of the subscribers want to receive events published by it, they need to subscribe to the given `Publisher`. 
   >
   > `java.util.concurrent.SubmissionPublisher` is an implementation of the `Publisher` interface.

   > The receiver of messages needs to implement the `Subscriber` interface. Typically this is the end for every `Flow` processing because 
   > the instance of it does not send messages further.
   >
   > This has four methods that need to be overridden – `onSubscribe()`, `onNext()`, `onError()`, and `onComplete()`.

   > If we want to transform incoming message and pass it further to the next `Subscriber`, we need to implement the `Processor` interface. 
   >
   > This acts both as a `Subscriber` because it receives messages, and as the `Publisher` because it processes those messages and sends 
   > them for further processing.

   > In summary this is a chain of `Publisher` to `Processor` to one or many `Subscriber`.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/reactive/Test.java)

  </details>

  <details>
   <summary>Unified JVM Logging</summary>

   > This feature introduces a common logging system for all components of the JVM. 
   >
   > It provides the infrastructure to do the logging, but it does not add the actual logging calls from all JVM components. 
   >
   > It also does not add logging to Java code in the JDK.
   >
   > The logging framework defines a set of tags – for example, gc, compiler, threads, etc. 
   >
   > We can use the command line parameter -Xlog to turn on logging during startup.
   >
   > Let’s log messages tagged with ‘gc’ tag using ‘debug’ level to a file called ‘gc.txt’ with no decorations:
   >   ```bash
   >   $ java -Xlog:gc=debug:file=gc.txt:none ...
   >   ```
   > 
   > -Xlog:help will output possible options and examples.
   >
   > Logging configuration can be modified runtime using `jcmd` command. We are going to set GC logs to info and redirect them to a file – gc_logs:
   >   ```bash
   >   $ jcmd 9615 VM.log output=gc_logs what=gc
   >   ```
   >
  </details>

  <details>
   <summary>Miscellaneous features</summary>

   > Some miscellaneous API improvements are:
   > - GC (Garbage Collector) Improvements
   > - Stack-Walking API
   > - Filter Incoming Serialization Data
   > - Deprecate the Applet API
   > - Indify String Concatenation
   > - Enhanced Method Handles
   > - Java Platform Logging API and Service
   > - Compact Strings
   > - Parser API for Nashorn

  </details>

## Java 10
  #### Feature release / Class file version 54 / Release date 20th March 2018

  <details>
   <summary>Local Variable Type Inference (JEP-286)</summary>

   > It allows to define a variable using var and without specifying the type of it. 
   > The compiler infers the type of the variable using the value provided. 
   > 
   > Noteworthy points:
   >  - This type inference is restricted only to local variables.
   >  - Local variable should be initialized at time of declaration otherwise compiler will not be infer and will throw error.
   >  - No type inference in case of member variable, method parameters, return values.
   >  - No dynamic type change. Once type of local variable is inferred it cannot be changed.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java10/Example1.java)

  </details>

  <details>
   <summary>Consolidate the JDK Forest into a Single Repository (JEP-296)</summary>

   > In JDK 9, the source code was located in eight separate Mercurial repositories, which often led to considerable additional work during development. 
   > For over a thousand changes, it was necessary to distribute logically related commits across multiple repositories.
   >
   > With JEP 296, the entire JDK source code was consolidated into a monorepo. The monorepo now allows atomic commits, branches, and pull requests, making development on the JDK much easier.

  </details>

  <details>
   <summary>Garbage-Collector Interface (JEP-304)</summary>

   > Before Java 10, GC (Garbage Collector) implementation components were scattered within code base and were not replaceable easily. 
   > 
   > With Java 10, `Garbage-Collector` interface is introduced so that alternative GC implementations can be plugged in. 
   >
   > It also helps in isolating the code base from different garbage collection implementations.

  </details>

  <details>
   <summary>Parallel Full GC for G1 (JEP-307)</summary>

   > Java 9 introduced G1 (Garbage First) garbage collector. G1 avoids full garbage collection but in case of concurrent threads look for 
   > collection and memory is not revived fast enough, user experience is impacted. 
   >
   > With Java 10, now G1 will use a fall back Full Garbage Collection. With this change, G1 improves its worst-case latency by using a Full GC in parallel. 
   >
   > At present, G1 uses a single threaded mark-sweep-compact algorithm. With JEP 307, a parallel thread will start mark-sweep-compact algorithm.
   >
   > Number of threads can be controlled using following option.
   > ```bash
   > $ java -XX:ParallelGCThreads=4
   > ```

  </details>

  <details>
   <summary>Application Class-Data Sharing (JEP-310)</summary>

   > When JVM starts it loads the classes in memory as a preliminary step. In case there are multiple jars having multiple classes, an evident lags appears for the first request. 
   >
   > In serverless architecture, such a lag can delay the boot time which is a critical operation in such an architecture. 
   > Application class-data sharing concept helps in reducing the start up time of an application. 
   >
   > Java has an existing CDS (Class-Data Sharing) feature. With Application class-data sharing, Java 10 allows to put application classes in a shared archive. 
   >
   > This reduces the application startup and footprint by sharing a common class meta data across multiple java processes.
   > 
   > Application Class data sharing is a 3 step process.
   >  - **Create a list of Classes to archive**
   >
   >      Create a list `welcome.lst` of a class `Greeting.java` lying in `welcome.jar` using Java Launcher.
   >      ```bash
   >      $ java -Xshare:off -XX:+UseAppCDS -XX:DumpLoadedClassList=welcome.lst -cp welcome.jar Greeting
   >      ```
   >  - **Create AppCDS archive**
   >
   >      Archive a list of classes to be used for Application class data sharing into a `welcome.jsa` file.
   >      ```bash
   >      $ java -Xshare:dump -XX:+UseAppCDS -XX:SharedClassListFile=welcome.lst -XX:SharedArchiveFile=welcome.jsa -cp welcome.jar
   >      ```
   >  - **Use AppCDS archive**
   >
   >      Use AppCDS archive while using java launcher.
   >      ```bash
   >      $ java -Xshare:on -XX:+UseAppCDS -XX:SharedArchiveFile=welcome.jsa -cp welcome.jar Greeting
   >      ```

  </details>

  <details>
   <summary>Thread-Local Handshakes (JEP-312)</summary>

   > Thread-local handshakes are an optimization to improve VM performance on x64 and SPARC-based architectures. The optimization is enabled by default.
   > 
   > In JDK 10, a new option is introduced for JVM as `-XX:ThreadLocalHandshakes`. This options works only for x64 and SPARC based machines.

  </details>

  <details>
   <summary>Remove the Native-Header Generation Tool (JEP-313)</summary>

   > Tool `javah` has been removed from Java 10 which generated C headers and source files which were required to implement native methods – now, `javac -h` can be used instead.

  </details>

  <details>
   <summary>Additional Unicode Language-Tag Extensions (JEP-314)</summary>

   > Java 7 introduced support for BCP 47 adds so-called "language-tag extensions". 
   > But this unicode locale extensions was limited to calendar and numbers. 
   >
   > With Java 10, `java.util.Locale` and related classes are updated to implement additional unicode extensions as specified in LDML specification. 
   > Following additional extensions are added:
   >  − cu / Currency Types
   >  - fw / First Day of a Week
   >  - rg / Region Override
   >  - tz / Time Zone
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java10/Example3.java)

  </details>

  <details>
   <summary>Heap Allocation on Alternative Memory Devices (JEP-316)</summary>

   > With this enhancement in Java 10, now user can specify an alternative memory device, like NV-DIMM to HotSpot VM to allocation the java heap space. 
   >
   > User need to pass a path to the file system using a new option `-XX:AllocateHeapAt`.
   > ```bash
   > -XX:AllocateHeapAt=~/etc/heap
   > ```
   > This option takes file path and do a memory mapping to achieve the desired result.

  </details>

  <details>
   <summary>Experimental Java-Based JIT Compiler (JEP-317)</summary>

   > JIT compiler is written in C++ and is used to convert Java into Byte Code.
   >
   > Now Java 10 has option to enable an experimental Java based JIT compiler, Graal to be used instead of standard JIT compiler.
   > 
   > Graal compiler is a complete rewrite of C++ based earlier compiler and is targeted for Linux/x64 based platform.
   > Graal is using JVMCI, JVM Compiler Interface which was introduced in Java 9.
   >
   > We can enable Graal to test and debug the experimental JVM compiler.
   > ```bash
   > $ java -XX:+UnlockExperimentalVMOptions -XX:+UseJVMCICompiler
   > ```
   > As Graal is experimental and is subject to testing effort considering various Hotspots and jdk tests with various flag options. It may fail some benchmarks for performance as compared to standard JIT Ahead of Time compilers.

  </details>

  <details>
   <summary>Root Certificates (JEP-319)</summary>

   > Until Java 9, the OpenJDK did not include root certificates in the cacerts keystore file, so SSL/TLS-based features were not readily executable.
   >
   > With JDK Enhancement Proposal 319, the root certificates contained in the Oracle JDK were adopted in the OpenJDK.

  </details>

  <details>
   <summary>Time-Based Release Versioning (JEP-322)</summary>

   > From Java 10 onwards, Oracle has introduced a strict time based release versioning model for Java releases. 
   > Now Java will have a major release after every six months.
   > 
   > Releases are further categoried into three broad categories:
   >  - **Feature Release:** It contains language specific features, JVM features, New/Improved APIs, Removal/Deprecation of APIs. 
   > Time of these feature releases is fixed and there is no constraint on features to be included in a particular release.
   >  - **Update Release:** It includes bug fixes, security issue fix, regression fixes etc. Each Feature release will receive 
   > two Update releases before next feature release is announced.
   >  - **Long Term Support(LTS) Release:** Long term support release will be announced after every three years starting from Sep, 2018. 
   > This release is primarily for Corporates using Java in production deployments.
   > 
   > A version now follows the following format: `$FEATURE.$INTERIM.$UPDATE.$PATCH`
   >  - **$FEATURE:** This number denotes the major feature release and will get incremented by 1 after every Feature Release.
   >  - **$INTERIM:** This number denotes any non-feature, non-update release which contains bug fixes and enhancements. 
   > This release is not having any incompatible changes, any API removal or change to standard API. 
   > A Feature release, will have this counter as 0.
   >  - **$UPDATE:** This number denotes the Update release done after a Feature Release.
   >  - **$PATCH:** This number denotes any emergency release incremented only in case an critical issue is to be promoted on emergent basis.
   >
  </details>

  <details>
   <summary>Container Awareness</summary>

   > JVMs are now aware of being run in a Docker container and will extract container-specific configuration instead of querying the operating system 
   > itself – it applies to data like the number of CPUs and total memory that have been allocated to the container.
   > 
   > However, this support is only available for Linux-based platforms. This new support is enabled by default and can be disabled in the command line with the JVM option:
   > ```bash
   > -XX:-UseContainerSupport
   > ```
   > Also, this change adds a JVM option that provides the ability to specify the number of CPUs that the JVM will use:
   > ```bash
   > -XX:ActiveProcessorCount=count
   > ```
   > Also, three new JVM options have been added to allow Docker container users to gain more fine-grained control over the amount of system memory that will be used for the Java Heap:
   > ```bash
   > -XX:InitialRAMPercentage
   > -XX:MaxRAMPercentage
   > -XX:MinRAMPercentage
   > ```

  </details>  

  <details>
   <summary>New APIs & Options</summary>

   > Following are some of the important enhancements introduced.
   >  - **Optional.orElseThrow() Method**
   >    * The method is an exact copy of the `get()` method but it throws a `NoSuchElementException` if no value is present.
   >  - **APIs to create Unmodifiable Collections**
   >    * A new method `copyOf()` is available in `List`, `Set` and `Map` interfaces which can create new collection instances 
   > from existing one. 
   >    * `Collector` class has new methods `toUnmodifiableList()`, `toUnmodifiableSet()`, and `toUnmodifiableMap()` 
   > to get elements of a stream into an unmodifiable collection.
   >  - **Disable JRE Last Usage Tracking**
   >    * A new flag is introduced `jdk.disableLastUsageTracking` which disables JRE last usage tracking for a running VM.
   >  - **Hashed Password**
   >    * The plain text passwords available in the `jmxremote.password` file are now being over-written with 
   > their `SHA3-512` hash by the JMX agent.
   >  - **javadoc Support for Multiple Stylesheets**
   >    * A new option is available to `javadoc` command as `--add-stylesheet`. This option supports use of multiple 
   > stylesheets in generated documentation.
   >  - **javadoc Support for Overridding methods**
   >    * A new option is available to `javadoc` command as `--overridden-methods=value`. As many classes override inherited 
   > methods but do not change the specification. The `--overridden-methods=value` option allows to group these methods 
   > with other inherited methods, instead of documenting them again separately.
   >  - **javadoc Support for Summary**
   >    * A new inline tag, `{@summary ...}`, is available to specify the text to be used as the summary of the 
   > API description. By default, the summary of an API description is inferred from the first sentence.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java10/Example2.java)

  </details>  

  <details>
   <summary>Removed Features & Options</summary>

   > JDK 10 release has removed several deprecated APIs, features and Options from Java library. Following is the relevant details.
   >  - **Unsupported LookAndFeels removed**
   >    * Applications using Nimbus or Aqua LookAndFeels has to migrate to new syntax.
   >  - **Runtime.getLocalizedInputStream and getLocalizedOutputStream Methods removed**
   >    * `Runtime.getLocalizedInputStream` and `Runtime.getLocalizedOutputStream` Methods are no more available as they were part of an obsolete internationalization mechanism.
   >  - **RMI Server-Side Multiplex Protocol Support removed**
   >    * RMI Server-Side Multiplex Protocol was disabled in Java 9 and is removed in Java 10.
   >  - **Common DOM APIs removed**
   >    * `com.sun.java.browser.plugin2.DOM`, and `sun.plugin.dom.DOMObject APIs` have been removed. `netscape.javascript.JSObject` is available to modify the DOM.
   >  - **FlatProfiler removed**
   >    * FlatProfiler was deprecated in Java 9 and is removed in Java 10.
   >  - **Obsolete -X Options removed**
   >    * `-Xoss`, `-Xsqnopause`, `-Xoptimize`, `-Xboundthreads`, and `-Xusealtsigs`, obsolete Hotspot VM options are removed in java 10.
   >  - **HostServicesgetWebContext Method removed**
   >    * `HostServicesgetWebContext` Method was deprecated in Java 9 and is removed in Java 10.
   >  - **T2K Rasterizer and ICU Layout Engine removed**
   >    * T2K rasterizer and ICU layout engine have been removed from JavaFX.
   >  - **VP6/FXM/FLV Code removed**
   >    * P6 video encoding format and FXM/FLV container support has been removed in JavaFX Media. H.264/AVC1 in the MP4 container or HTTP Live Streaming is to be used instead.
   >  - **Pre-1.2 SecurityManager Methods and Fields removed**
   >    * The pre-1.2 deprecated java.lang.SecurityManager methods and fields(marked forRemoval=true) have been removed.
   >  - **policytool removed**
   >    * The policytool security tool has been removed.
   >  - **Deprecated Classes in com.sun.security.auth package removed**
   >    * com.sun.security.auth.PolicyFile
   >    * com.sun.security.auth.SolarisNumericGroupPrincipal
   >    * com.sun.security.auth.SolarisNumericUserPrincipal
   >    * com.sun.security.auth.SolarisPrincipal
   >    * com.sun.security.auth.X500Principal
   >    * com.sun.security.auth.module.SolarisLoginModule
   >    * com.sun.security.auth.module.SolarisSystem
   >  - **Old(JDK 6, JDK 7, and JDK 8 Era) Standard Doclet removed**
   >    * The old (JDK 6, JDK 7 and JDK 8 era) standard doclet, used to output HTML content, and are superseded by a replacement, has been removed.
   >  - **javah tool removed**
   >    * The Native-Header Generation Tool, javah has been removed.
   >  - **Java Launcher's Data Model Options -d32 and -d64 removed**
   >    * The obsolete and deprecated selection options (-d32, -d64, -J-d32 and -J-d64) have been removed.
   > 

  </details>  

  <details>
   <summary>Deprecated Features & Options</summary>

   > JDK 10 release has deprecated several APIs, features and Options from Java library. Following is the relevant details.
   >  - **SNMP Monitoring Support deprecated**
   >    * `jdk.snmp` module supporting SNMP monitoring and management support for the JVM is now deprecated and is marked `forRemoval=true`.
   >  - **java.security classes deprecated**
   >    * `java.security.{Certificate, Identity, IdentityScope, Signer}` classes are now deprecated and is marked `forRemoval=true`.
   >  - **javax.security.auth.Policy API forRemoval**
   >    * The deprecated `javax.security.auth.Policy` is marked `forRemoval=true`.
   >  - **APIs marked for removal**
   >    * java.activation
   >    * java.corba
   >    * java.se.ee (aggregator)
   >    * java.transaction
   >    * java.xml.bind
   >    * java.xml.ws
   >    * java.xml.ws.annotation
   > 

  </details>

## Java 11
  #### Long-term support version / Class file version 55 / Release date 25th September 2018

  <details>
   <summary>Nest-Based Access Control (JEP-181)</summary>

   > It supports `private` access within nest members directly, no more via an auto-generated bridge method `access$000`.
   > 
   > Furthermore, new nested APIs for validation and allowed private reflection access within nest members.
   >
   > Before Java 11:
   > ```java
   > public class Alphabet {
   >  private String name = "I'm Alphabet!";
   > 
   >  public class A {
   >      public void printName() {
   >          System.out.println(name);       // access Alphabet's private member!
   >      }
   >  }
   > }
   > ```
   > If we compile the above class, it will generate two classes, `Alphabet` and `Alphabet$A`, even a nested class is a typical class with a unique name. 
   > 
   > The JVM access rule will not allow `private` access within different classes. 
   > However, Java allowed `private` access within nest members, so the Java compiler creates a bridge method `access$000` to apply on the JVM access rule.
   > ```java
   > // After javac Alphabet.java, Java compiler created something similar to this.
   > public class Alphabet {
   >   private String name = "I'm Alphabet!";
   >   String access$000(){
   >     return name;
   >   }
   > }
   > 
   > public class Alphabet$A {
   >   final Alphabet obj;
   >   public void printName(){
   >     System.out.println(obj.access$000());
   >   }
   > }
   > ```
   > In Java 11, The Java compiler will not generate any bridge method `access$000` for `private` access within nest members. 
   > 
   > This new JVM access rule, Nest-Based Access Control allowed private access within nest members.
   >

  </details>

  <details>
   <summary>Dynamic Class-File Constants (JEP-309)</summary>

   > Extends class-file format to support a new constant-pool form, `CONSTANT_Dynamic`, target language designers and compiler implementors.
   >

  </details>

  <details>
   <summary>Improve Aarch64 Intrinsics (JEP-315)</summary>

   > Optimized the existing string and array intrinsics, and implements new intrinsics for `Math.sin()`, `Math.cos()` and `Match.log()` on Arm64 or Aarch64 processors. 
   > It means better performance.
   > 
   > P.S An intrinsic is used to leverage CPU architecture-specific assembly code to improve the performance.
   >

  </details>

  <details>
   <summary>Epsilon, A No-Op Garbage Collector (JEP-318)</summary>

   > A new No-Op (no operations) Garbage Collector, it allocates memory but will not collect any garbage (memory allocation), once the Java heap is exhausted, the JVM will shut down.
   >
   > A few use cases:
   >  * Performance testing
   >  * VM interface testing
   >  * Short-lived jobs
   >
   >  This GC is an experimental feature; we need to use the following options to enable the new Epsilon GC:
   > ```bash
   > -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC
   > ```

  </details>

  <details>
   <summary>Remove the Java EE and CORBA Modules (JEP-320)</summary>

   > Java 9 deprecated the following Java EE and CORBA modules and now removed in Java 11. If you want to migrate to Java 11, make sure your project didn’t 
   > use any of the following packages or tools.
   >
   > Removed packages:
   >  * java.xml.ws (JAX-WS)
   >  * java.xml.bind (JAXB)
   >  * java.activation (JAF)
   >  * java.xml.ws.annotation (Common Annotations)
   >  * java.corba (CORBA)
   >  * java.transaction (JTA)
   >  * java.se.ee (Aggregator module for the six modules above)
   >   
   >  Removed Tools:
   >  * wsgen and wsimport (from jdk.xml.ws)
   >  * schemagen and xjc (from jdk.xml.bind)
   >  * idlj, orbd, servertool, and tnamesrv (from java.corba)

  </details>

  <details>
   <summary>HTTP Client API standardized (JEP-321)</summary>

   > This `HTTP Client API`, in the `java.net.http` package was introduced in Java 9, updated in Java 10, now a standard feature in Java 11.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java9/Example9.java)

  </details>

  <details>
   <summary>Local-Variable Syntax for Lambda Parameters (JEP-323)</summary>

   > This JEP adds support for the `var` keyword in lambda parameters instead of the explicit types.
   >
   > The benefit is we can add annotations to the lambda parameters without explicit types, only with `var` keyword.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example1.java)

  </details>

  <details>
   <summary>Key Agreement with Curve25519 and Curve448 (JEP-324)</summary>
   
   > Java Cryptography related item. It replaced the existing elliptic curve Diffie-Hellman (ECDH) scheme 
   > with `Curve25519` and `Curve448` algorithms, a key agreement scheme defined in RFC 7748.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example2.java)

  </details>

  <details>
   <summary>Unicode 10 (JEP-327)</summary>

   > It means more code points, more emoji icons :)
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example3.java)

  </details>

  <details>
   <summary>Flight Recorder (JEP-328)</summary>

   > Java Flight Recorder (JFR) was a commercial product in Oracle JDK, now it is open source in OpenJDK 11. 
   > This JFR is a profiling tool that used to diagnose a running Java application. 
   >
   > The below command starts a 60 seconds JFR recording on a Java application, dumps the recorded data into a `.jfr` file:
   > ```bash
   > $ java -XX:StartFlightRecording=duration=60s,settings=profile,filename=app.jfr MyHelloWorldApp
   > ```
   > You can use Java Mission Control (JMC) to analyze and visualize the `.jfr` file.

  </details>

  <details>
   <summary>ChaCha20 and Poly1305 Cryptographic Algorithms (JEP-329)</summary>

   > ChaCha20 is a high-speed stream cipher, an encryption and decryption algorithm. 
   > 
   > ChaCha20-Poly1305 means ChaCha20 running in AEAD mode with the Poly1305 authenticator, 
   > encryption and authentication together, both are defined in RFC 7539. 
   > 
   > This JEP update of ChaCha20 cryptographic algorithms is a replacement for the insecure RC4 stream cipher.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example4.java)

  </details>

  <details>
   <summary>Launch Single-File Source-Code Programs without compilation (JEP-330)</summary>

   > This Single-File Source-Code Program means the entire Java program in a single source code `.java` file. 
   > 
   > This JEP is a friendly feature in the early stage of learning Java, but not much benefit in Java development, 
   > we all use IDE.
   >
   > Before Java 11:
   > ```bash
   > $ javac HelloJava.java
   > $ java HelloJava
   > ```
   > Now Java 11:
   > ```bash
   > $ java HelloJava.java
   > ```

  </details>

  <details>
   <summary>Low-Overhead Heap Profiling (JEP-331)</summary>

   > Java Virtual Machine Tool Interface (JVMTI) was introduced in J2SE 5, JDK 5 (Tiger), it provides APIs 
   > for profiling or monitoring tools to access the JVM state. 
   > 
   > This JEP added new low overhead heap profiling API into the JVMIT.

  </details>

  <details>
   <summary>Transport Layer Security (TLS) 1.3 (JEP-332)</summary>

   > Java 11 supports RFC 8446 Transport Layer Security (TLS) 1.3 protocol. 
   > 
   > However, not all TLS 1.3 feature is implemented, refer to this JEP 332 for detail.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example5.java)

  </details>

  <details>
   <summary>ZGC A Scalable Low-Latency Garbage Collector (JEP-333)</summary>

   > The Z Garbage Collector (ZGC) is an experimental garbage collector; it has low pause times not exceed 10ms. 
   > 
   > This ZCG support only on Linux/64.
   >
   > This ZGC garbage collector is a product feature in Java 15.

  </details>

  <details>
   <summary>Deprecate the Nashorn JavaScript Engine (JEP-335)</summary>

   > The Nashorn JavaScript script engine and the `jjs` tool are deprecated, and it will probably 
   > remove in the future release.

  </details>

  <details>
   <summary>Deprecate the Pack200 Tools and API (JEP-336)</summary>

   > This JEP deprecates the `pack200` and `unpack200` tools, and the `Pack200` API in `java.util.jar` package, 
   > and it will probably remove in the future release.
   >
   > Java 14 removed the Pack200 Tools and APIs.

  </details>

  <details>
   <summary>Collection API Updates</summary>

   > Java 11 introduced an easy way to convert a collection to an array.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example7.java)

  </details>

  <details>
   <summary>String API Updates</summary>

   > Java 11 introduced multiple enhancements to `String`.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example6.java)

  </details>

  <details>
   <summary>Files API Updates</summary>

   > Java 11 introduced an easy way to read and write files by providing new overloaded methods 
   > without writing much boiler plate code.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example8.java)

  </details>

  <details>
   <summary>Optional Updates</summary>

   > Java 11 introduces new methods in the `Optional` class.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example9.java)

  </details>

  <details>
   <summary>Predicate Updates</summary>

   > Java 11 introduces a `not` method in the `Predicate` class.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java11/Example10.java)

  </details>

## Java 12
  #### Feature release / Class file version 56 / Release date 19th March 2019

  <details>
   <summary>Shenandoah: A Low-Pause-Time Garbage Collector (JEP-189)</summary>

   > Shenandoah is a new low-pause and concurrent garbage collector, it reduces GC pause time and independent of the 
   > Java heap size (5M or 5G of heap size have the same pause time, useful for large heap applications.)
   > 
   > This GC is an experimental feature, and we need to use the following options to enable the new Shenandoah GC:
   > ```bash
   > -XX:+UnlockExperimentalVMOptions -XX:+UseShenandoahGC
   > ```
   >
   > This Shenandoah GC became a product feature in Java 15.

  </details>

  <details>
   <summary>Microbenchmark Suite (JEP-230)</summary>

   > Added a range of Java Microbenchmark Harness (JMH) benchmarks to the JDK source code, 
   > for those interested to add or modify the JDK source code itself, now they have a way 
   > to compare the performance.

  </details>

  <details>
   <summary>Switch Expressions (JEP-325)</summary>

   > This feature enhanced the existing `switch` statements (returns nothing) to support 
   > `switch` expressions (returns something).
   >
   > Switch expressions become a standard feature in Java 14.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java12/Example1.java)

  </details>

  <details>
   <summary>JVM Constants API (JEP-334)</summary>

   > A new package `java.lang.constant`, a list of new classes and interfaces to model the key class-file and run-time 
   > artifacts, for example, the [constant pool](https://docs.oracle.com/javase/specs/jvms/se10/html/jvms-4.html#jvms-4.4).

  </details>

  <details>
   <summary>One AArch64 Port, Not Two (JEP-340)</summary>

   > Before Java 12, there are two different source code or ports for the 64-bit ARM architecture:
   > * Oracle – `src/hotspot/cpu/arm`
   > * Red Hat? – `src/hotspot/cpu/aarch64`
   > 
   > Java 12 removed the Oracle `src/hotspot/cpu/arm` port, and maintain only one port `src/hotspot/cpu/aarch64`, 
   > and make this `aarch64` the default build for the 64-bit ARM architecture.

  </details>

  <details>
   <summary>Default CDS Archives (JEP-341)</summary>

   > The Class Data Sharing (CDS) improved the start-up time by reuse an existing archive file.
   > 
   > Before Java 12, we need to use `-Xshare:dump` to generate the CDS archive file for the JDK classes. 
   >
   > In Java 12, there is a new `classes.jsa` file in the `/bin/server/` directory, a default CDS archive file for the JDK classes.

  </details>

  <details>
   <summary>Abortable Mixed Collections for G1 (JEP-344)</summary>

   > This JEP improves the performance of the Garbage-first (G1) collector, by splits the problematic collection set into two parts – mandatory and optional. 
   >
   >The G1 will abort the optional part if lack of time to handle it.

  </details>

  <details>
   <summary>Promptly Return Unused Committed Memory from G1 (JEP-346)</summary>

   > This JEP improves the performance of the Garbage-first (G1) collector. 
   >
   > If the application is low of the activity or idle, G1 periodically trigger a concurrent cycle to determine overall Java heap usage and return unused 
   > Java heap memory to the operating system.

  </details>

  <details>
   <summary>String API Updates</summary>

   > Java 12 introduced multiple enhancements to String:
   >  - **String.indent()**
   >    * Adjust the indention of each line of string based on argument passed.
   >  - **String.transform()**
   >    * It applies an arbitrary function to a String and returns the function's return value
   >  - **String.describeConstable()**
   >    * It returns Optional Object containing description of String instance.
   >  - **String.resolveConstantDesc()**
   >    * Returns descriptor instance string of given string.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java12/Example2.java)

  </details>

  <details>
   <summary>Files API Updates</summary>

   > Java 12 introduced multiple enhancements to Files:
   >  - **Files.mismatch()**
   >    * It provides an easy way to compare two files.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java12/Example3.java)

  </details>

  <details>
   <summary>Compact Number Formatting</summary>

   > Java 12 introduces compact formatting where we can format long numbers for decimal, currency or percentages to short form or long form. 
   > For example 1000 to 1K.
   > 
   > We can get its instance via the `getCompactNumberInstance` method in `NumberFormat` class.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java12/Example4.java)

  </details>

  <details>
   <summary>Teeing Collector in Stream API</summary>

   > Java 12 introduced a new static method to 'Collectors' interface which can perform two different operations on collection and then merge the result:
   >  - **Collectors.teeing(Collector downstream1, Collector downstream2, BiFunction merger)**
   >    * Each element of the collection passed to the teeing collector is processed by `downstream1` and `downstream2` collectors, 
   >      once the processing is completed by both the collectors, the results are passed to the `BiFunction` collector to merge 
   >      the result or process accordingly. It is similar to calling two functions on a collection and then calling the 
   >      third function to process the results of first two functions.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java12/Example5.java)

  </details>

## Java 13
  #### Feature release / Class file version 57 / Release date 17th September 2019

  <details>
   <summary>Dynamic CDS Archives (JEP-350)</summary>

   > The Class Data Sharing (CDS) improves startup performance by creating a class-data archive once and 
   > reusing it so that the JVM needs not to recreate it again. Java 10 introduced JEP 310 Application Class-Data Sharing.
   > 
   > This JEP simplifying the process of creating CDS archives.
   >
   > This command creates a CDS archive file of a .jar:
   > ```bash
   > $ java -XX:ArchiveClassesAtExit=hello.jsa -cp hello.jar Hello
   > ```
   >
   > This command runs a .jar with an existing CDS archive:
   > ```bash
   > $ java -XX:ArchiveClassesAtExit=hello.jsa -cp hello.jar Hello
   > ```

  </details>

  <details>
   <summary>ZGC: Uncommit Unused Memory (JEP-351)</summary>

   > Java 11 introduced the JEP 333: Z Garbage Collector (Experimental); it provides a short pause times 
   > when cleaning up heap memories. 
   > 
   > However, it didn’t return unused heap memory to the operating system, even when it was unused for a long time.
   >
   > This JEP enhanced the ZGC by returning unused heap memory to the operating system.

  </details>

  <details>
   <summary>Reimplement the Legacy Socket API (JEP-353)</summary>

   > The underlying implementations of `java.net.Socket` and `java.net.ServerSocket` are ancient, dating back to JDK 1.0, 
   > a mix of legacy Java and C code that is hard to maintain and debug.
   >
   > This JEP introduces new underlying implementations for the Socket APIs, which is the default implementation in Java 13.
   > 
   > Before Java 13, it uses the `PlainSocketImpl` for the `SocketImpl`. Java 13 introduced a new `NioSocketImpl` class 
   > as a drop-in replacement for `PlainSocketImpl`.
   >
   > However, if something goes wrong, we can still switch back to the old implementation `PlainSocketImpl` by setting 
   > `jdk.net.usePlainSocketImpl` system property.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)
   > 
   > Run the sample using launch single-file source-code programs without compilation feature and notice 
   > the `NioSocketImpl` class loaded:
   > ```bash
   > $ java -XX:+TraceClassLoading src/main/java/co/com/mrsoft/test/java13/Example1.java | grep SocketImpl
   > [0.040s][info   ][class,load] java.net.SocketImpl source: jrt:/java.base
   > [0.044s][info   ][class,load] java.net.SocketImpl$$Lambda$1/0x0000000800ba0840 source: java.net.SocketImpl
   > [0.047s][info   ][class,load] sun.net.PlatformSocketImpl source: jrt:/java.base
   > [0.047s][info   ][class,load] sun.nio.ch.NioSocketImpl source: jrt:/java.base
   > [0.054s][info   ][class,load] sun.nio.ch.NioSocketImpl$FileDescriptorCloser source: jrt:/java.base
   > ```
   > 
   > Run the sample switching back to `PlainSocketImpl` by setting the Djdk.net.usePlainSocketImpl system property. 
   > ```bash
   > $ java -XX:+TraceClassLoading -Djdk.net.usePlainSocketImpl src/main/java/co/com/mrsoft/test/java13/Example1.java | grep SocketImpl
   > [0.041s][info   ][class,load] java.net.SocketImpl source: jrt:/java.base
   > [0.045s][info   ][class,load] java.net.SocketImpl$$Lambda$1/0x0000000800ba0840 source: java.net.SocketImpl
   > [0.048s][info   ][class,load] sun.net.PlatformSocketImpl source: jrt:/java.base
   > [0.048s][info   ][class,load] java.net.AbstractPlainSocketImpl source: jrt:/java.base
   > [0.048s][info   ][class,load] java.net.PlainSocketImpl source: jrt:/java.base
   > [0.048s][info   ][class,load] java.net.AbstractPlainSocketImpl$1 source: jrt:/java.base
   > ```
   >
   > Note: If `-XX:+TraceClassLoading` is not working use `-verbose:class`.

  </details>

  <details>
   <summary>Switch Expressions (Preview) (JEP-354)</summary>

   > Java 12 introduced JEP 325 Switch expressions. This JEP dropped `break` value in favor of `yield` keyword to 
   > return a value from switch expressions.
   >
   > This switch expression becomes a standard feature in Java 14.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example2.java)

  </details>

  <details>
   <summary>Text Blocks (Preview) (JEP-355)</summary>

   > Before Java 13, to define a multiline string, we used to use escape sequences for line breaks 
   > and double quotes contained in the string.
   > ```java
   > String sql =
   >      "SELECT id, firstName, lastName FROM Employee\n"
   >          + "WHERE departmentId = \"IT\"\n"
   >          + "ORDER BY lastName, firstName";
   > ```
   >
   > This JEP introduces a multi-line string literal, a text block.
   > ```java
   > String sql = """
   >      SELECT id, firstName, lastName FROM Employee
   >      WHERE departmentId = "IT"
   >      ORDER BY lastName, firstName""";
   > ```
   > 
   > This text blocks is a permanent feature in Java 15.
   >
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example3.java)

  </details>

  <details>
   <summary>String API Updates</summary>

   > `java.lang.String` has three new methods to manipulate text blocks:
   >  - **String.stripIndent()**
   >    * Mimics the compiler to remove incidental white space from the start and end of string.
   >  - **String.translateEscapes()**
   >    * Translates escape sequences such as “\\t” to “\t”.
   >  - **String.formatted()**
   >    * Works the same as String::format, but for text blocks.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example4.java)

  </details>  

  <details>
   <summary>FileSystems API updates</summary>

   > New methods have been added to the `FileSystems` class:
   >  - **FileSystems.newFileSystem()**
   >    * These are 3 different overloaded methods that make it easier to use file system providers, 
   >      which treats the contents of a file as a file system.

  </details>  

  <details>
   <summary>DOM/SAX Factories</summary>

   > There are new methods to instantiate DOM and SAX factories with Namespace support.
   >  - **DocumentBuilderFactory.newDefaultNSInstance()**
   >    * It creates a new NamespaceAware instance of a DocumentBuilderFactory builtin system-default implementation.
   >  - **DocumentBuilderFactory.newNSInstance()**
   >    * It creates a new NamespaceAware instance of a DocumentBuilderFactory.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example5.java)

  </details>  

## Java 14
  #### Feature release / Class file version 58 / Release date 17th March 2020

  <details>
   <summary>Pattern Matching for instanceof (Preview) (JEP-305)</summary>

   > Before Java 14, we use `instanceof` and cast to check the object’s type and cast to a variable.
   > 
   > Now in Java 14, you don't need to do the cast. Cast and assignment are part of `instanceof` expression.
   > This is also known as pattern variable.
   >
   > This becomes a standard feature in Java 16.
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java14/Example1.java)

  </details>  

  <details>
   <summary>Packaging Tool (JEP-343)</summary>

   > New jpackage tool to package a Java application into a platform-specific package like:
   > - Linux: deb and rpm
   > - macOS: pkg and dmg
   > - Windows: msi and exe
   > 
   > This packaging tool is a standard feature in Java 16.

  </details>  

  <details>
   <summary>NUMA-Aware Memory Allocation for G1 (JEP-345)</summary>

   > New NUMA-aware memory allocation mode, improves the G1 performance on large machines. 
   >
   > Add `+XX:+UseNUMA` option to enable it.

  </details>  

  <details>
   <summary>JFR Event Streaming (JEP-349)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Non-Volatile Mapped Byte Buffers (JEP-352)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Helpful NullPointerExceptions (JEP-358)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Records (Preview) (JEP-359)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Switch Expressions (Standard) (JEP-361)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Deprecate the Solaris and SPARC Ports (JEP-362)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Remove the Concurrent Mark Sweep (CMS) Garbage Collector (JEP-363)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>ZGC on macOS (Experimental) (JEP-364)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>ZGC on Windows (Experimental) (JEP-365)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Deprecate the ParallelScavenge + SerialOld GC Combination (JEP-366)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Remove the Pack200 Tools and API (JEP-367)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Text Blocks (Second Preview) (JEP-368)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

  </details>  

  <details>
   <summary>Foreign-Memory Access API (Incubator) (JEP-370)</summary>

   > asdfg:
   >  - **asdfg**
   >    * asdfg
   > 
   > [Example](src/main/java/co/com/mrsoft/test/java13/Example1.java)

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
 * https://www.baeldung.com/java-9-reactive-streams
 * https://www.geeksforgeeks.org/java-9-features-with-examples/

### Java 10
 * https://www.tutorialspoint.com/java10/index.htm
 * https://www.baeldung.com/java-10-overview
 * https://www.digitalocean.com/community/tutorials/java-10-features
 * https://www.happycoders.eu/java/java-10-features/
  
### Java 11
 * https://www.happycoders.eu/java/java-11-features/
 * https://mkyong.com/java/what-is-new-in-java-11/ 
 * https://www.tutorialspoint.com/java11/java11_overview.htm
 * https://www.baeldung.com/java-11-new-features
 * https://www.digitalocean.com/community/tutorials/java-11-features

### Java 12
 * https://www.happycoders.eu/java/java-12-features/
 * https://mkyong.com/java/what-is-new-in-java-12/ 
 * https://www.tutorialspoint.com/java12/java12_overview.htm
 * https://www.baeldung.com/java-12-new-features
 * https://www.digitalocean.com/community/tutorials/java-12-features

### Java 13
 * https://www.happycoders.eu/java/java-13-features/
 * https://mkyong.com/java/what-is-new-in-java-13/
 * https://www.tutorialspoint.com/java13/java13_overview.htm
 * https://www.baeldung.com/java-13-new-features
 * https://www.digitalocean.com/community/tutorials/java-13-features

### Java 14
 * https://www.happycoders.eu/java/java-14-features/
 * https://mkyong.com/java/what-is-new-in-java-14/
 * https://www.tutorialspoint.com/java14/java14_overview.htm
 * https://www.baeldung.com/java-14-new-features
 * https://www.digitalocean.com/community/tutorials/java-14-features

### Java 17
 * https://mkyong.com/java/what-is-new-in-java-17/
