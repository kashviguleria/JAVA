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

class puppy extends dog{
    void play(){
        System.out.println("play");
    }
}




public class multipleinheritance {
    public static void main(String[] args) {
        
    
    dog d=new dog();
    d.eat();
    d.bark();


    puppy p=new puppy();
    p.eat();
    p.bark();
    p.play();

    }
    
}
