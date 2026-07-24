class math{
    int square(int n){
        return n*n;
    }
}

public class creatingmethod {
    public static void main(String[] args) {
        math d= new math();
        System.out.println(d.square(5));
    }
}
