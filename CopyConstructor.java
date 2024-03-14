public class CopyConstructor {
    public static void main(String[] args){
       Student s1 = new Student();
       s1.name = "Rahul";
       s1.roll = 10;
       s1.password = "bcjbkjadb";

       System.out.println(s1.name);
       System.out.println(s1.roll);
       System.out.println(s1.password);


       Student s2 = new Student(s1);
       System.out.println(s2.name);
       System.out.println(s2.roll);
       System.out.println(s2.password);
       
       
    }


}

class Student{
    String name;
    int roll;
    String password;

    //normal constructor
    Student(){
        System.out.println("constuctor called");
    }

    //Copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }
}
