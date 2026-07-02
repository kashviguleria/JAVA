package c1;
import java.util.Scanner;

public class stringboolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean name = sc.nextBoolean(); // Reads one word
       

        System.out.println("My name is " + name);

        sc.close();
    }
}
