package c1;
import java.util.Scanner;

public class stringchar {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        char name = sc.next().charAt(1); // Reads one word
       

        System.out.println("My name is " + name);

        sc.close();
    }
}
