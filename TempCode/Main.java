
public class Main{
    public static void main(String[] args){
        int[] arr = {47,86,15,62,99};
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

