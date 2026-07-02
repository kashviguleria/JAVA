import java.util.Scanner;
public class p2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){ 
            for(int j=1;j<=i;j++){
                // j is for 1 12 123 1234 and i for the same no.
                System.out.print( j+"");// the " "is for space in b/w
            }
            System.out.println();
        }
        sc.close();

    }
    
}
