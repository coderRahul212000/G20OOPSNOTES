public class OOPS{
    public static void main(String[] args) {
       //creating object
       Pen p1 = new Pen(); // created a object called p1
       p1.setColor("Blue");
       System.out.print(p1.color);

       Student s1 = new Student(); // created
       s1.name = "Rahul";
       s1.age = 40;
       
      s1.calcPercentage(10, 3, 9);

    }
}

class Pen{
    //properties
    String color;
    int tip;
   
    //methods(behaviors)

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (((phy + chem + math) / 3));
        System.out.println(percentage);
    }
}