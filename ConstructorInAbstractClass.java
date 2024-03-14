public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        // Animal a = new Animal();
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.print(h.color);

       
    }
}

abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println(" animal eats");
    }
  
    abstract void walk(); 
}


class Horse extends Animal{
    
    void changeColor(){
        color = "dark brown";
    }   

    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    
    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("walk on 2 legs");
    }
}


