#### Running JShell
``` bash
➜  build git:(main) ✗ jshell
|  Welcome to JShell -- Version 18.0.1.1
|  For an introduction type: /help intro

jshell>
```
#### Create and invoke method
``` bash
jshell> void greet() { System.out.println("Hello World!"); }
|  created method greet()

jshell> greet()
Hello World!
```

#### Creating variables
``` bash
jshell> String name = "Mahesh";
name ==> "Mahesh"

jshell> Date date = new Date();
date ==> Thu Mar 07 09:58:02 CET 2024

jshell> name
name ==> "Mahesh"

jshell> date
date ==> Thu Mar 07 09:58:02 CET 2024
```

#### Evaluate expressions
``` bash
jshell> String.format("%d pages read.", 10);
$7 ==> "10 pages read."

jshell> $7
$7 ==> "10 pages read."
```

#### Built-In commands
``` bash
jshell> /vars
|    String name = "Mahesh"
|    Date date = Thu Mar 07 09:58:02 CET 2024
|    String $7 = "10 pages read."

jshell> /methods
|    void greet()

jshell> /history

void greet() { System.out.println("Hello World!") }
void greet() { System.out.println("Hello World!"); }
greet()
String name = "Mahesh";
Date date = new Date();
name
date
String.format("%d pages read.", 10);
$7
/vars
/methods
/history

jshell> /exit
|  Goodbye
```
