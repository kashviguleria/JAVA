// package evaluation1;
import java.util.Scanner;
public class secondsmallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int[] arr= new int[5] ;
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE;
    int min1=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min1=min;
            min=arr[i];
        }
        else if(arr[i]<min1 && arr[i]!=min){
            min1=arr[i];
        }
    }
    System.out.println(min1);

    
}
}

