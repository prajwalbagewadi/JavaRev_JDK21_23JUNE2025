# Question (375) Maximum and Minimum Element in an Array

Maximum and minimum of an array using minimum number of comparisons
Last Updated : 23 Jul, 2025
Given an array, the task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output: Minimum element is: 3
Maximum element is: 35

## Algorithm:

- create two variables max and min, init both max and min to arr[0].
- use a for (i=0;i<arr.length;i++) to traverse the array.
- check if(arr[i]>max) {set max=arr[i]}
- check if(arr[i]<min) {set min=arr[i]}
- print and view max and min after the loop ends.

## Code:

```
public class Main{
    public static void main(String[] args){
        int[] arr = {22,14,8,17,35,3};
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max=arr[i];
            }
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
```
