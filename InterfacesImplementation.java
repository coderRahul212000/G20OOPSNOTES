public class InterfacesImplementation {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();

        Rook rk = new Rook();
        rk.moves();
    }
}

interface ChessPlayer {
    void moves();
    // ye by default abstract hoga
    // chessPlayer k andr iski implementation ni likh skta kyunki abstraction ko implement krna hai
}

class Queen implements ChessPlayer{
    public void moves(){
            // public isliye likha kyunki fir ye default type ka hojayega na likhne pr
            System.out.println("up,down,left,right, diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
            // public isliye likha kyunki fir ye default type ka hojayega na likhne pr
            System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
            // public isliye likha kyunki fir ye default type ka hojayega na likhne pr
            System.out.println("up,down,left,right, diagnol-(by 1 step)");
    }
}

