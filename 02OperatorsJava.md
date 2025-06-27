# Operators in Java

## Arithmetic Operators

```
 //Arithmetic Operators
    int a=10,b=5;
    System.out.println("add="+(a+b));
    System.out.println("Substract="+(a-b));
    System.out.println("Multiply="+(a*b));
    System.out.println("(quotient)divide="+(a/b));
    System.out.println("(remainder)Modulus="+(a%b));

```

## Relational / Comparison Operators

```
public class Main{
  public static void main(String[] args) {
    int a=10,b=5;
    System.out.println("Equal to:"+(a==b));
    System.out.println("Not equal to:"+(a!=b));
    System.out.println("Greater than:"+(a>b));
    System.out.println("Greater than:"+(a>b));
    System.out.println("Less than:"+(b<a));
    System.out.println("Greater than or equal:"+(a>=b));
    System.out.println("Less than or equal:"+(b<=a));
  }
}
```

## Logical Operators

```
public class Main{
  public static void main(String[] args) {
    int a=10,b=5;
    //Logical Operators
    System.out.println("Logical AND:"+(a>b&&b<a));
    System.out.println("Logical OR:"+(a>b||a<b));
    System.out.println("Logical NOT:"+(!(a>b&&b<a)));
  }
}
```

## Assignment Operators

```
public class Main{
  public static void main(String[] args) {
    int a;
    //Assignment Operators
    System.out.println("=:"+(a=10));
    System.out.println("+=:"+(a+=10));
    System.out.println("-=:"+(a-=5));
    System.out.println("*=:"+(a*=5));
    System.out.println("/=:"+(a/=5));
    System.out.println("%=:"+(a%=5));
  }
}
```

## Unary Operators

```
public class Main{
  public static void main(String[] args) {
    int a=10;
    // Unary Operators
    System.out.println("Unary plus (positive):"+(+a));
    System.out.println("Unary minus (negative):"+(-a));
    a++;
    System.out.println("Increment:"+(a));
    a--;
    System.out.println("Decrement:"+(a));
    System.out.println("Logical NOT:"+(!true));
  }
}
```

## Bitwise Operators

```
public class Main{
 public static void main(String[] args) {
   // Bitwise Operators
             // 8 4 2 1
   int a=10; // 1 0 1 0
   int b=5;  // 0 1 0 1
   System.out.println("Bitwise AND:"+(a&b)); //1010 & 0101 = 0000
   System.out.println("Bitwise OR:"+(a|b)); //1010 | 0101 = 1111
   System.out.println("Bitwise XOR:"+(a^b)); //1010 ^ 0101 = 1111
   System.out.println("Bitwise NOT:"+(~a)); //~1010 = -(1010+1) =-1011
   System.out.println("\tLeft shift:"+(a<<1)); //1010<<1= (1010*2) = 20
   System.out.println("\tRight shift:"+(a>>1)); //1010>>1= (1010/2) = 5
   System.out.println("\tRight shift twice:"+(a>>2)); //1010>>2= (1010/2^2) (10/4)= 5
 }
}
```

## Ternary Operator

Shorthand for if-else.

```
condition ? expression_if_true : expression_if_false;
public class Main{
  public static void main(String[] args) {
   int age=15;
   String result=(age>18)?"Adult":"Not Adult";
   System.out.println("result="+result);
  }
}
```

## instanceof

```
class Book{
  public Book(){
    System.out.println("Constructor of book.");
  }
}
public class Main{
  public static void main(String[] args) {
    Book b1=new Book();
    System.out.println("is b1 instanceof:"+(b1 instanceof Book));
  }
}

```
