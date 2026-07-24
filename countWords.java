public class countWords {
    public static void main(String[] args) {
        String str="sasfvrdzz how are ypu";
        String[] words=str.trim().split("\\s+");
        System.out.println(words.length);
    }
}
