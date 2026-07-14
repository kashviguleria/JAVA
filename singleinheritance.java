class animal{
    void eat(){
        System.out.println("animal eats");
    }

}

class dog extends animal{
    void bark(){
        System.out.println("barking");
    }

}




public class singleinheritance{
    public static void main(String[] args) {
        
    
    dog d=new dog();
    d.eat();
    d.bark();

    }
}