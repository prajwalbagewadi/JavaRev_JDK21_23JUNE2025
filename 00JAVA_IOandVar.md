# JAVA INPUT OUTPUT AND Variables

In Java, input and output (I/O) are handled using streams—essentially sequences of data.

## Output in Java:

Java uses System.out to send output to the console.

System.out : is a built-in object that represents the standard output stream, typically your console or terminal window.

```
System.out.print("hello world."); //prints text  without newline
System.out.println("hello world."); //prints text and moves to the next line.
System.out.printf("Msg:%s","Hello world."); //formatted output, similar to C.
//print User Error Messages.
System.err.println("Error from user.") ;
```

## Input in Java:

The most common way is using the Scanner class:

import the Scanner Class

```
import java.util.Scanner;
```

create Scanner class object

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //Scanner class object
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Name:");
      String name=sc.next();
      System.out.println("Enter Age:");
      int age=sc.nextInt();

      System.out.println("Name:"+name);
      System.out.println("Age:"+age);
    }
}
```

System.in: in Java is the standard input stream, typically connected to the keyboard. It’s part of the System class and is used to read input from the user.
By itself, System.in is a low-level InputStream, so it reads raw bytes. That’s why we usually wrap it in a higher-level class like Scanner or BufferedReader to make it easier to work with.

## Using Scanner with System.in

```
Scanner sc=new Scanner(System.in);
String item=sc.nextLine(); // Reads a line of text
```

## Using BufferedReader with System.in

Similar to Scanner class but requires additional class InputStreamReader
InputStreamReader: acts as a bridge between byte streams and character streams.
BufferedReader: wraps the character streams making reading efficient.

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    String name=reader.readLine(); // Reads a line of text
    System.out.println("hello."+name);
  }
}
```

## Console class:

The Console class in Java is part of the java.io package and provides a simple way to interact with the user via the command line—especially useful for reading text and passwords securely.

```
import java.io.Console;

public class Main{
  public static void main(String[] args){

    // Accessed via System.console()—you don’t create a Console object directly.
    Console con=System.console();
    String name=con.readLine();
    System.out.println("hello:"+name+" from console. Password:");
    char[] pass=con.readPassword();
    String password=String.valueOf(pass);//converts char[] to string
    System.out.println("Password:"+password);
  }
}
```

## Variables:

A variable is a named container that holds data which can change during program execution.

```
int age = 25;
String name = "Prajwal";
```

Types of Variables:
1.Local Variables – declared inside methods or blocks.
2.Instance Variables – declared inside a class but outside methods; each object gets its own copy.
3.Static Variables – declared with the static keyword; shared across all instances of a class.
4.In Java, there’s no true “global variable” like in some other languages—but you can simulate global behavior using static variables inside a class.

```
public class Globals{
    public static int count=0;
    public static final String APP_NAME = "MyApp";
}
```

## Constants:

A constant is a variable whose value cannot be changed once assigned. In Java, this is done using the final keyword.

```
final double PI = 3.14159;
final int MAX_USERS = 100;
```
