# DataTypes In JAVA.

## Data types in Java define the type of data a variable can hold.

Java is a statically typed language, meaning you must declare the
type of a variable when you create it.

# Primitive Data Types

These are the basic built-in types in Java.

## byte:

Size: 1 byte (8-bit)
Range: Stores whole numbers from -128 to 127

```
    byte age=127; //-128 to 127
    System.out.println("byte:"+age);
```

## short:

Size: 2 bytes
Range: -32,768 to 32,767

```
    short year=2025;
    System.out.println("short:"+year);
```

```

```

## int:

Size: 4 bytes
Range: -2,14,74,83,648(-2^31) to 2,147,483,647(2^31-1)

```
    int	salary=50000;
    System.out.println("int:"+salary);
```

## long:

Size: 8 bytes
Range: -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63-1)

```
    long population=1000000000L;
    System.out.println("long:"+population);
```

## float:

size: 4 bytes
Range: 3.14f, -1.23e-10f ~6-7 significant decimal digits

```
float pi = 3.14f;
System.out.println("float:"+pi);
```

## double:

Size: 8 bytes
Range: 3.1415d, 1.23e100d ~15-16 significant decimal digits

```
double rate = 7.5;
System.out.println("double:"+rate);
```

## char:

Size: 2 bytes
Range: Single 16-bit Unicode character

```
char grade = 'A';
System.out.println("char:"+grade);
```

## boolean:

Size: 1 bit only
Range : true or false

```
boolean isPassed = true;
System.out.println("boolean:"+isPassed);
```

# Non-Primitive Data Types

Non-primitive data types (also called reference types) are types not built into the language — they are created by the programmer or provided by Java's class libraries.

these Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory.

## String:

Sequence of characters.
string is designed to hold a sequence of characters in a single variable whereas, a character array is a collection of separate char-type entities.

```
String name="admin";
System.out.println("String:"+name);
```

## Arrays:

A collection of elements of the same type (e.g., int[], String[]).

```
Syntax:
type[] arrayName;
type arrayName[];

Declaration + Initialization
int[] arr=new int[5];

int[] arr1={10,20,30,40,50};
String[] cart={"Chips🍟","Cookies🍪","Eggs🥚","Bread🍞"};

class Main {
    public static void main(String[] args) {
        String[] cart={"Chips🍟","Cookies🍪","Eggs🥚","Bread🍞"};
        //foreach loop
        for(String item:cart){
            System.out.println("Item:"+item);
        }
    }
}
```

## Class:

Class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.

```
Syntax:
class ClassName {
    // Fields (variables)
    dataType variableName;

    // Constructor
    ClassName() {
        // initialization code
    }

    // Methods
    returnType methodName(parameters) {
        // method body
    }
}

class Car{
    private String brand;
    private String model;
    private int year;
    // constructor
    public Car(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    //methods
    public void Accept(String brand,String model,int year){
        this.brand=brand; //this denotes current object invoking the method
        this.model=model;
        this.year=year;
    }
    public void display(){
        System.out.println("this.brand:"+brand);
        System.out.println("this.model:"+model);
        System.out.println("this.year:"+year);
    }
}

class Main {
public static void main(String[] args) {
        Car c1 = new Car("Nissan","Skyline GT-R (R34)",1999);
        c1.display();
    }
}
```

## Interfaces:

An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).

```
Syntax:
interface InterfaceName {
    // Constant fields (implicitly public static final)
    int CONSTANT_FIELD = 10;

    // Abstract methods (implicitly public abstract)
    void abstractMethod();

    // Default methods (introduced in Java 8)
    default void defaultMethod() {
        System.out.println("Default implementation");
    }

    // Static methods (introduced in Java 8)
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    // Private methods (introduced in Java 9, for internal use by default/static methods)
    private void privateHelperMethod() {
        System.out.println("Private helper method");
    }
}

//Interface
interface Animal{
  //abstract method
  public abstract void animalSound();
  public abstract void sleep();
}
// class Dog implements interface Animal
class Dog implements Animal{
   public void animalSound(){
      System.out.println("woof woof!.");
   }
   public void sleep(){
     System.out.println("Zzz...");
   }
}

class Main{
  public static void main(String[] args){
    //polymorphic reference (Animal a1 = new Dog();)
    Animal a1=new Dog();
    a1.animalSound();
    a1.sleep();
  }
}
```

## Objects:

An Object is a basic unit of Object-Oriented Programming and represents real-life entities. A typical Java program creates many objects, which as you know, interact by invoking methods. An

object consists of :
State: It is represented by the attributes of an object. It also reflects the properties of an object.
Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
Identity: It gives a unique name to an object and enables one object to interact with other objects.

```
class Fruits{
    //State
    private String fname;
    private int fQuan;
    private double fprice;
    //Behavior
    public Fruits(String fname,int fQuan,double fprice){
        this.fname=fname;
        this.fQuan=fQuan;
        this.fprice=fprice;
    }
    public void disp(){
        System.out.println("NAME:"+this.fname);
        System.out.println("Price:"+this.fprice);
        System.out.println("Quantity:"+this.fQuan);
    }
}
class Main {
    public static void main(String[] args) {
        //objects/Identity
        Fruits f1=new Fruits("Pineapple 🍍",700,135);
        Fruits f2=new Fruits("cherry 🍒",200,99);
        f1.disp();
        f2.disp();
    }
}
```
