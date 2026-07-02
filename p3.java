import java.util.Scanner;
public class p3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--){ //for descending order
            for(int j=1;j<=i;j++){ //j=1 as we want smallest no
                System.out.print(j+"");
            }
            System.out.println();
           
        }
         sc.close();
    }
    
}
