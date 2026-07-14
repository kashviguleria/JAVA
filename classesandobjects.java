
class marker{
String color;
String brand;
String size;

void write() {
    System.out.println("Writing with " + brand + " marker");
}

void open() {
    System.out.println("Opening marker");
}

void close() {
    System.out.println("Closing marker");
}
}

public class classesandobjects {
    public static void main(String[] args) {
        
    
    marker m = new marker();
       m.color = "black";
        m.brand="luxor";

        m.write();


       marker p = new marker();
        p.color = "red";
        p.brand = "promax";
        p.size = "XL";


     System.out.print(m.color);
        m.write();
        m.open();
        m.close();

    }
}

