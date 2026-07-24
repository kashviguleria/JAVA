class Movie {
    String name;
    String hero;
    int year;

    Movie(String name, String hero, int year) {
        this.name = name;
        this.hero = hero;
        this.year = year;
    }
}


public class creatingclass {
   public static void main(String[] args) {
     Movie m = new Movie("Jawan", "Shah Rukh Khan", 2023);

        System.out.println( m.name);
        System.out.println( m.hero);
        System.out.println(m.year);
   } 
}
