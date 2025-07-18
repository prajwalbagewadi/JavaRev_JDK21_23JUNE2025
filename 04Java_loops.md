# loops

A loop is a control structure that repeats a block of code as long as a specified condition is true.

## Why use loops?

Loops help avoid code repetition and automate repetitive tasks like:

- Printing a message multiple times

- Processing each item in an array

- Taking repeated user input until they exit

## types of loops

## while loop

Used when the number of iterations is unknown and the condition is checked before the loop runs.

```

import java.util.Random;

public class SystemMonitor {
    //Simulate CPU usage as a random number between 0 and 100
    public static int getCpuUsage() {
        Random rand = new Random();
        return rand.nextInt(101); //rand.nextInt(n) returns a number between 0 to n-1.
    }
    public static void main(String[] args) {
        boolean serverRunning = true; // checkServerRunning()
        while(serverRunning) {
            int cpuUsage = getCpuUsage(); // Simulated CPU usage
            if(cpuUsage >= 80) {
                System.out.println("🥵 Cpu Usage is High:"+cpuUsage+"%");
                System.out.println("Start Thermal throttling");
            }  else {
                System.out.println("😊 Cpu Usage is Normal:"+cpuUsage+"%");
            }

            //Simulate server stop condition (e.g., admin command or shutdown flag)
            if(cpuUsage == 0) {
                System.out.println("😴 Server Shutting down.");
                serverRunning = false;
            }
        }
    }
}
```
