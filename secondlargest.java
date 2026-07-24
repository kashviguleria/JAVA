// package evaluation1;
import java.util.Scanner;
public class secondlargest {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int[] arr =new int[5];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0]; // always take this
    int max1=Integer.MIN_VALUE;
    for(int i=1;i<arr.length;i++){ //start from 1 
        if(arr[i]>max){
            max1=max;
            max=arr[i];

        }
        else if(arr[i]>max1 && arr[i]!=max){
            max1=arr[i];
        }
    }
System.out.println(max1);
}
}