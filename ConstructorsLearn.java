public class ConstructorsLearn {
    
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student();
        System.out.println(s1.name);
    }

}

class Student{
    String name;
    int roll;

     // constructor formation
    Student(String name){ //parameterized constructor
        this.name = name;
        System.out.println("constructor is called");
    }
}