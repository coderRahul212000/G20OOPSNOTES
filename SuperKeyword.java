public class SuperKeyword {
    public static void main(String[] args){
        Horse h = new Horse();
        // System.out.println(h.color); 
    }
}

class Animal {
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse(){
        super(); //animal constructor is called
        super.color = "brown"; //animal ki value bhi set krdi
        System.out.println("horse constructor is called");
        // System.out.println(super.color);
    }
}
