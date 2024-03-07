#### Step 1: Create the following folder structure
``` bash
> mkdir -p src
> mkdir -p build/java7
> mkdir -p build/java9
> mkdir -p src/java7/co/com/mrsoft/test/multirelease
> mkdir -p src/java9/co/com/mrsoft/test/multirelease
``` 

#### Step 2: Create Java 7 specific java class
``` java
package co.com.mrsoft.test.multirelease;

public class Test {
   public static void main(String[] args) {
      System.out.println("Inside java 7");
   }
}
``` 

#### Step 3: Create Java 9 specific java class
``` java
package co.com.mrsoft.test.multirelease;

public class Test {
   public static void main(String[] args) {
      System.out.println("Inside java 9");
   }
}
``` 

#### Step 4: Compile specific versions from the root folder of the project
``` bash
> javac -d build/java7 --release 7 src/java7/co/com/mrsoft/test/multirelease/Test.java
```
 
``` bash
> javac -d build/java9 --release 9 src/java9/co/com/mrsoft/test/multirelease/Test.java
```

#### Step 5: Create a Multi-release Jar from the root folder of the project
``` bash
> jar --create --file test.jar --main-class co.com.mrsoft.test.multirelease.Test -C build/java7 . --release 9 -C build/java9 .
```

#### Step 6: List content of the Jar file
``` bash
> jar tf test.jar

META-INF/
META-INF/MANIFEST.MF
co/
co/com/
co/com/mrsoft/
co/com/mrsoft/test/
co/com/mrsoft/test/multirelease/
co/com/mrsoft/test/multirelease/Test.class
META-INF/versions/9/
META-INF/versions/9/co/
META-INF/versions/9/co/com/
META-INF/versions/9/co/com/mrsoft/
META-INF/versions/9/co/com/mrsoft/test/
META-INF/versions/9/co/com/mrsoft/test/multirelease/
META-INF/versions/9/co/com/mrsoft/test/multirelease/Test.class
```

#### Step 7: Review MANIFEST.MF content
``` bash
> unzip -q -c test.jar META-INF/MANIFEST.MF

Manifest-Version: 1.0
Created-By: 18.0.1.1 (Oracle Corporation)
Main-Class: co.com.mrsoft.test.multirelease.Test
Multi-Release: true
```

#### Step 8: Run the Jar with JDK 7
``` bash
java -jar test.jar

Inside java 7
```

#### Step 9: Run the Jar with JDK 9
``` bash
java -jar test.jar

Inside java 9
```