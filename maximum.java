package c5;
import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        try (Scanner k = new Scanner(System.in)) {
            int arr[] = new int[5]; // initialization 
            for (int i = 0; i < arr.length; i++) {
                arr[i] = k.nextInt();  //input of array 
            }
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i]; //always max = arr 
                }
            }
            System.out.print(max);
        }
    }
}
