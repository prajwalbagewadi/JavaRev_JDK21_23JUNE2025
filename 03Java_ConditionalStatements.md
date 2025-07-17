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

nested if

switch

break
