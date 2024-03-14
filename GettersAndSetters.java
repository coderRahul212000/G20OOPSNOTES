public class GettersAndSetters {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        //getter
        System.out.print(p1.getColor());
        p1.setTip(10);
        System.out.print(p1.getTip());
        p1.setColor("Yellow");
        System.out.print(p1.getColor());
       

    }
}

class Pen{
    private String color;
    private int tip;

    //getters and setters

    //getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }


    //setters
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int tip){
        this.tip = tip;
    }
}
