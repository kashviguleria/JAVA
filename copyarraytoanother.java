// package evaluation1;
import java.util.Scanner;

public class copyarraytoanother {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        int[] arr1= new int[5];

           for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr1[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        
    }
}
}
