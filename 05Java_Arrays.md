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
