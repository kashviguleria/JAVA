package c1;
import java.util.Scanner;

public class stringinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next(); // Reads one word
        // String name = sc.nextLine(); // Reads the entire line

        System.out.println("My name is " + name);

        sc.close();
    }
}
