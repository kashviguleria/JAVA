public class countSpecialCharacter {
    public static void main(String[] args) {
        String str= "1234@jhb-343";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(!Character.isLetterOrDigit(ch)&& ch!=' ')
                count++;
        }
        System.out.println(count);
    }
}
