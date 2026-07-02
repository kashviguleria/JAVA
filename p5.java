import java.util.Scanner;
public class p5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){ //j=rows as we want largest no
                System.out.print(j+" ");
            }
            System.out.println();
        }
    sc.close();
    }
    
}
