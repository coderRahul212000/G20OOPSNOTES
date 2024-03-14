public class TypesOfConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student(10);
        
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called");
    }

    Student(String name){
        this.name = name;
        System.out.println("constructor 2 is called");
    }

    Student(int roll){
        this.roll = roll;
        System.out.println("constructor 3 is called");
    }
}
