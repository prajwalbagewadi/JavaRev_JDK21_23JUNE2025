import static java.lang.System.out;

public class Code {
   public static void main(String[] args) {
       out.println("print odd and even numbers between 1 to 100:");
       int[] odd = new int[101];
       int[] even = new int[101];
       for(int i=1;i<=100;i++){
        if(i%2==0){
            out.println(i+" even");
            even[i]=i;
        } else {
            out.println(i+" odd");
            odd[i]=i;
        }
       }
       out.println("odd numbers:");
       for(int num:odd){
            if(num==0){//skip 0
                continue;
            }
            out.print(num+" ");
       }
       out.println();
       out.println("even numbers:");
       for(int num:even){
            if(num==0){//skip 0
                continue;
            }
            out.print(num+" ");
       }
   } 
}
