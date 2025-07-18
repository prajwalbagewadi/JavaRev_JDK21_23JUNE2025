# Conditional Statements

## if,else

It allows a program to take different actions based on whether a condition is true or false.

```
import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("Enter Password:");
        String pass=sc.next();
        if(pass.equals("admin@123")){
            System.out.println("Successfully Unlocked.");
        } else {
            System.out.println("Error Access Denied.");
        }
    }
}

```

## else-if

The else if statement is used in programming to check multiple conditions one after another.when the if condition returns false.

```

import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        double balance=4400.00;
        double amount;
        System.out.println("Enter Amount to withdraw:");
        amount=sc.nextDouble();
        if(balance==0.00){
            System.out.println("Insufficient Funds. Your Balance is $0");
        } else if (amount > balance) {
            System.out.println("Not Enough Balance. your short off $"+(amount-balance));
            System.out.println("Need overdraft of $"+(amount-balance));
        } else {
            System.out.println("Amount withdraw Successful. Collect Cash.");
            balance=balance-amount;
            System.out.println("Balance:"+balance);
        }
    }
}

```

## nested if

A nested if means putting one if inside another if.
This is useful when a decision depends on a previous condition being true.

```

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Item Id:");
        int itemId = sc.nextInt();
        int db = 1111;
        int stock = 1111;
        if(itemId == db){
            if(itemId == stock){
                System.out.println("Item is available,Pay to checkout.");
            } else {
                System.out.println("Item unavailable in stock, Get Notification when available");
            }
        } else {
            System.out.println("Item not available in Inventory.");
        }
    }
}
```

## switch

The switch statement in Java (and many other languages) is used as an alternative to multiple if-else statements when checking a single variable against many values.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values for a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Select the Operator +,-,*,/,%:");
        char opr=sc.next().charAt(0);  // ✅ Gets first character from input
        switch(opr) {
            case '+':
                System.out.println("a="+a+" b="+b+" addition ="+(a+b));
            break;
            case '-':
                System.out.println("a="+a+" b="+b+" substraction ="+(a-b));
            break;
            case '*':
                System.out.println("a="+a+" b="+b+" multiplication ="+(a*b));
            break;
            case '/':
                System.out.println("a="+a+" b="+b+" Division ="+(a/b));
            break;
            case '%':
                System.out.println("a="+a+" b="+b+" modulo ="+(a%b));
            break;
            default:
                System.out.println("unknown operator!");
        }
    }
}
```

## nested switch

## break

Used to exit a loop or a switch statement immediately.

```
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==3){
                System.out.println("reached 3. Stopping.");
                break;
            }
        }
    }
}
```

## continue

Used to skip the current iteration of the loop and continue to the next one.

```
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==3){
                System.out.println("Skipping  3.");
                continue;
            }
        }
    }
}
```
