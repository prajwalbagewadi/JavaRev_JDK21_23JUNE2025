# OOPS Concepts in JAVA

OOPS (Object-Oriented Programming System) is a programming paradigm that organizes software design around objects rather than functions and logic.

Java is built entirely on OOPS principles, which makes it powerful for building modular, reusable, and maintainable code.

## Classes and Objects

In Java, classes and objects are the foundation of everything in object-oriented programming.

## Class:

A class is like a blueprint or template. It defines the structure and behavior (data and methods) that the objects created from it will have.

```
Eg:
class Book{
  private int id;
  private String name;
  private String author;
  private double price;
  private String category;
  public void acceptBook(int id,String name,String author,double price,String category){
    this.id=id;
    this.name=name;
    this.author=author;
    this.price=price;
    this.category=category;
  }
  public void showBook(){
    System.out.println("Book:");
    System.out.println("id:"+this.id);
    System.out.println("name:"+this.name);
    System.out.println("author:"+this.author);
    System.out.println("category:"+this.category);
    System.out.println("price:"+this.price);
  }
}

public class Main{
  public static void main(String[] args) {
    System.out.println("main() method running.");
    Book b1=new Book();
    b1.acceptBook(1, "The Cat Who Saved Books", "Sosuke Natsukawa"
            ,426.00, "Fantasy");
    b1.showBook();
    System.out.println("main() method stopped.");
  }
}
```

## object

An object is an instance of a class. It’s the actual thing you use in your program

```
public class Main{
  public static void main(String[] args) {
    System.out.println("main() method running.");
    //object
    Book b1=new Book();
    b1.acceptBook(1, "The Cat Who Saved Books", "Sosuke Natsukawa"
            ,426.00, "Fantasy");
    b1.showBook();
    System.out.println("main() method stopped.");
  }
}
```

## four main pillars of OOPS in Java:

## Encapsulation

Encapsulation is the process of wrapping data (variables) and code (methods) into a single unit (class) and restricting direct access to the data using private variables with public getter and setter methods.

```
class Book{
  private int id;
  private String name;
  private String author;
  private double price;
  private String category;
  public Book(int id,String name,String author,double price,String category){
    this.id=id;
    this.name=name;
    this.author=author;
    this.price=price;
    this.category=category;
  }
  //getter and setters
  public int getId(){
    return this.id;
  }
  public void setId(int id){
    this.id=id;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getAuthor(){
    return this.author;
  }
  public void setAuthor(String author){
    this.author=author;
  }
  public String getCategory(){
    return this.category;
  }
  public void setCategory(String category){
    this.category=category;
  }
  public double getPrice(){
    return this.price;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public void showBook(){
    System.out.println("Book:");
    System.out.println("id:"+this.id);
    System.out.println("name:"+this.name);
    System.out.println("author:"+this.author);
    System.out.println("category:"+this.category);
    System.out.println("price:"+this.price);
  }
}

public class Main{
  public static void main(String[] args) {
    System.out.println("main() method running.");
    Book b1=new Book(1, "The Cat Who Saved Books", "Sosuke Natsukawa"
    ,426.00, "Fantasy");
    b1.showBook();
    System.out.println("Added 10% discount.");
    //formula originalPrice - originalPrice * 10/100
    System.out.println("discount:"+b1.getPrice()*10/100);
    b1.setPrice(b1.getPrice()-b1.getPrice()*10/100);
    System.out.println("discounted Price."+b1.getPrice());
    System.out.println("main() method stopped.");
  }
}
```

## Abstraction

Abstraction is the process of hiding internal details and showing only essential features, achieved in Java using abstract classes and interfaces.

```
abstract class ATM{
  //abstract method
  public abstract void performTransaction(double amt) throws InterruptedException;
  //concreate method
  public void insertCard() throws InterruptedException{
    System.out.println("Please Insert card");
    System.out.println("Processing please wait.");
    Thread.sleep(5000); //mili
    System.out.println("Card Inserted.");
  }
}

class Withdraw extends ATM{
  @Override
  public void performTransaction (double amt) throws InterruptedException{
    System.out.println("Amount:"+amt+" Withdrawing Cash.");
    System.out.println("Processing please wait.");
    Thread.sleep(2000); //mili
    System.out.println("Collect cash.");
  }
}

class Deposit extends ATM{
  @Override
  public void performTransaction(double amt) throws InterruptedException{
    System.out.println("Amount:"+amt+" Depositing Cash.");
    System.out.println("Processing please wait.");
    Thread.sleep(2000); //mili
    System.out.println("Cash Deposited.");
  }
}

public class Main{
  public static void main(String[] args) throws InterruptedException{
    ATM t1=new Withdraw();
    t1.insertCard();
    t1.performTransaction(500.00);
    t1=new Deposit();
    t1.performTransaction(1000.00);
    ATM t2=new Withdraw();
    t2.insertCard();
    t2.performTransaction(500.00);
    t2=new Deposit();
    t2.performTransaction(1000.00);
  }
}

/*
The user interacts with ATM, not knowing how Withdraw or Deposit works internally.
performTransaction() is abstract — actual behavior is defined in subclasses.
This is abstraction: show what is needed, hide the rest.
*/
```

## Inheritance

A feature in object-oriented programming where a class (child) inherits properties and methods from another class (parent), enabling code reuse and logical hierarchy.
Example: Dog inherits from Animal.

```
class Animal{
  public void eat(){
    System.out.println("Eating...");
  }
}
class Dog extends Animal{
  public void sound(){
    System.out.println("Dog Barking...");
  }
}
class Main{
  public static void main(String[] args){
    //commonly create object of child class
    Dog a1=new Dog();
    a1.eat();
    a1.sound();
  }
}
```

## Types of Inheritance

## Single Inheritance

One subclass inherits from one superclass.

```
class Animal{
  public void eat(){
    System.out.println("Eating...");
  }
}
class Dog extends Animal{
  public void sound(){
    System.out.println("Dog Barking...");
  }
}
class Main{
  public static void main(String[] args){
    //commonly create object of child class
    Dog a1=new Dog();
    a1.eat();
    a1.sound();
  }
}
```

## Multilevel Inheritance

When a class inherits from a class, which itself inherits from another class.

```
class GrandFather{
  public String property="House";
  public GrandFather(){
    System.out.println("GrandFather:");
    System.out.println("Build House.");
  }
}

class Father extends GrandFather{
  public String car="ford mustang";
  public Father(){
    System.out.println("Father:");
    System.out.println("inherits:"+super.property);
    System.out.println("Bought:"+this.car);
  }
}

class Son extends Father{
  public Son(){
    System.out.println("Son:");
    System.out.println("inherits:"+super.property);
    System.out.println("inherits:"+super.car);
  }
}

class Main{
  public static void main(String[] args){
    //commonly create object of child class
    Son son=new Son();
  }
}
```

## Hierarchical Inheritance

Multiple subclasses inherit from a single superclass.

```
class BankAccount{
  String accountNumber;
  double balance;
  public void deposit(double amount){
    this.balance+=amount;
    System.out.println("Deposited:"+amount);
  }
  public void displayBalance(){
    System.out.println("balance:"+this.balance);
  }
}

//Derived class 1
class SavingsAccount extends BankAccount{
  double interestRate=0.03;
  public void addInterest(){
    double interest=super.balance*interestRate;
    super.balance+=interest;
    System.out.println("Interest added:"+interest);
  }
}

//Derived class 2
class CurrentAccount extends BankAccount{
  double overDraftLimit=1000000;
  public void withDraw(double amount){
    if(super.balance+overDraftLimit>=amount){
      balance-=amount;
      System.out.println("withdrawn:"+amount);
    } else{
      System.out.println("overDraftLimit Exceeded.");
    }
  }
}

//Derived class 3
class FixedDepositAccount extends BankAccount{
  int durationInMonths;
  double interestRate=0.065;
  double amount;
  int n = 12; // monthly compounding
  int timeInYears;
  public void setDuration(int months){
    durationInMonths=months;
    timeInYears=durationInMonths/12;
    System.out.println("FD duration set to:"+months+"months");
    amount=super.balance*Math.pow((1+(interestRate/n)),n*timeInYears);
    System.out.printf("Maturatity Amount:%.2f\n",amount);
  }
}
public class Main{
  public static void main(String[] args){
    SavingsAccount sa=new SavingsAccount();
    sa.deposit(5000);
    sa.addInterest();
    sa.displayBalance();

    CurrentAccount ca=new CurrentAccount();
    ca.deposit(3000);
    ca.withDraw(2500);
    ca.displayBalance();

    FixedDepositAccount fda=new FixedDepositAccount();
    fda.deposit(5000);
    fda.setDuration(12);
    fda.displayBalance();
  }
}
/*
super.balance+overDraftLimit>=amount
Example:
Suppose:
balance = ₹2000
overdraftLimit = ₹1000
amount = ₹2500

Then:
balance + overdraftLimit = 2000 + 1000 = 3000

Check:
3000 >= 2500 ✅  // true → withdrawal allowed

amount=4000
if (3000 >= 4000) // false
*/
```

## Multiple Inheritance

Java does not allow multiple inheritance with classes to avoid ambiguity, but it does allow multiple inheritance using interfaces.

- Polymorphism
  Means “many forms.” It allows objects to be treated as instances of their parent class rather than their actual class. Java supports:
- Compile-time polymorphism (method overloading)
- Runtime polymorphism (method overriding)
