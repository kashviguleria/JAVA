class Student {
    String name;
    int rollno;
    String course;

    // Default constructor
    Student() {
        this("Kashvi", 1001, "AI");   // Calls parameterized constructor
        System.out.println("Default constructor is called");
    }

    // Parameterized constructor
    Student(String name, int rollno, String course) {
        this.name = name;
        this.rollno = rollno;
        this.course = course;
        System.out.println("Parameterized constructor is called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
    }

    void study() {
        System.out.println(name + " is studying Java");
    }
}

public class thismethod {
    public static void main(String[] args) {

        Student kashvi = new Student();                  // Default constructor
        Student yashika = new Student("Yashika", 1002, "AI");

        System.out.println();

        kashvi.display();
        System.out.println();

        yashika.display();
        System.out.println();

        kashvi.study();
        yashika.study();
    }
}