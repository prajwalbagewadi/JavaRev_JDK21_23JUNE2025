# Arrays in Java

An array in Java is a container object that holds a fixed number of values of a single data type.

## Declaring an Array

```
int[] numbers;  // preferred style
or
int numbers[];
```

## Creating (Allocating) an Array

```
numbers = new int[5];  // array of 5 integers (default initialized to 0)
int[] numbers = new int[5];
```

## Initializing an Array

```
numbers[0] = 1;
numbers[1] = 2;
numbers[2] = 3;
or
int[] numbers = {10,20,30,40,50};
```

## Accessing Array Elements

```
System.out.println("access 0th element in array:"+numbers[0]);
```

## Looping Through an Array:

### using for loop:

### Array.Lenght:

In Java, the length of an array is determined by accessing its length property. This is a built-in attribute of arrays, not a method, meaning you do not use parentheses when accessing it.

```
int[] Array = {1,2,3,4,5};
for(int i=0;i<Array.lenght;i++){
    System.out.println(Array[i]);
}
```

### Using enhanced for-loop:

```
int[] Array = {1,2,3,4,5};
for(int num:Array){
    System.out.println(num);
}
```

## Array of Other Types:

```
String[] names = {"Alice", "Bob", "Charlie"};
```

## Java Program:

This Java program is a simple array input/output demo using the Scanner class to accept user input.

```
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter Elements in array:");
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter the Element:");
            numbers[i]=sc.nextInt();
        }
        System.out.println("Elements in Array:");
        for(int num : numbers){
            System.out.println("num:"+num);
        }
    }
}
```
