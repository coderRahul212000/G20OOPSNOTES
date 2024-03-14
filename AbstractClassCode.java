public class AbstractClassCode {
    public static void main(String[] args) {
        // Animal a = new Animal();
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    // animal nai idea dedia hai walk() ka jiski implementation horse and chicken apne apne liye dekh lete hai
    abstract void walk(); // ismai implementation ni likha hai humne. abstract method ka implementation ni likhte hai hum
}


class Horse extends Animal{
    // ab horse ko implement krna hi hoga walk ko

    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}


