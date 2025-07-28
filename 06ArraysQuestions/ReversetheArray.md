# ReversetheArray

Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}  
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = {4, 5, 1, 2}
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

## Algorithm:

- 1. initialize low=0,mid=array.length/2,high=array.length-1
- 2. check if array length is odd or even
- 3. if odd while low is less than mid and mid is less than high
- 4. swap array[low] and array[high]
- 5. increament low and decreament high
- 6. else even while low is less than equal to mid and mid is less than equal to high
- 7. swap array[low] and array[high], swaps the center two elements as well.
- 8. increament low and decreament high

## Code:

```
import static java.lang.System.out;
public class Main{
    public static void arrRev(int[] arr){
        int low = 0;
        int mid = arr.length/2;
        int high = arr.length-1;
        if(arr.length%2!=0) {
            out.println("arr length is odd:"+arr.length);
            out.println("mid="+mid);
            while(low<mid && mid<high) {
                out.println("low="+low);
                out.println("high="+high);
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        } else {
            out.println("\n arr length is even:"+arr.length);
            out.println("mid="+mid);
            while(low<=mid && mid<=high) {
                out.println("low="+low);
                out.println("high="+high);
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args){

        int[] arr = {4,5,1,2};
        System.out.println("\noriginal array:");
        for(int num:arr){
            System.out.print(num+"\s");
        }
        arrRev(arr);
        System.out.println("reversed array:");
        for(int num:arr){
            System.out.print(num+"\s");
        }
        int[] arr2 = {1,4,3,2,6,5};
        System.out.println("\noriginal array:");
        for(int num:arr2){
            System.out.print(num+"\s");
        }
        arrRev(arr2);
        System.out.println("reversed array:");
        for(int num:arr2){
            System.out.print(num+"\s");
        }
    }
}
/*
 * output:
 * 2 5 1 4
 */
/*
 * output:
 * cd "c:\Users\bagew\Desktop\WebDev\JavaRE2\JavaRevision_23JUNE2025\TempCode\" ; if ($?) { javac Main.java } ; if ($?) { java Main }
PS C:\Users\bagew\Desktop\WebDev\JavaRE2\JavaRevision_23JUNE2025\TempCode> cd "c:\Users\ba
gew\Desktop\WebDev\JavaRE2\JavaRevision_23JUNE2025\TempCode\" ; if ($?) { javac Main.java } ; if ($?) { java Main }                                                                 original array:
4 5 1 2 arr length is even:4
mid=2
low=0
high=3
low=1
high=2
reversed array:
2 1 5 4
original array:
1 4 3 2 6 5
 arr length is even:6
mid=3
low=0
high=5
low=1
high=4
low=2
high=3
reversed array:
5 6 2 3 4 1
 */
```
