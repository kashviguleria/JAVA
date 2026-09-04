

public class reverseaString {
    public static void main(String[] args) {
        
    
    String str="kashvi is best";
    String reverese="";
    for(int i=str.length()-1;i>=0;i--){
        reverese+=str.charAt(i);
    }
    System.out.println(reverese);

    }
}

