public class Interfaces{
    public static void main(String args[]){
        // Queen q = new Queen();
        // q.move();

        // King k = new King();
        // k.move();

        Beer b = new Beer();
        b.eat();
        b.veg();
        b.nVeg();
    }
}

// Muptiple Inheritance

interface vegAnimanl{
    void eat();
    void veg();
}
interface NonvegAnimanl{
    void eat();
    void nVeg();
}
class Beer implements vegAnimanl, NonvegAnimanl {
    public void eat(){
        System.out.println("beer eat ");
    }
    public void veg(){
        System.out.println("beer eat veg ");
    }
    public void nVeg(){
        System.out.println("beer eat NOn veg ");
    }
}

interface ChessPlayer{
        void move();
    }

    class Queen implements ChessPlayer {
        public void move(){
            System.out.println("Queen Move");
        }
    }
    class Rook implements ChessPlayer {
        public void move(){
            System.out.println("Rook Move");
        }
    }
    class King implements ChessPlayer {
        public void move(){
            System.out.println("King Move");
        }
    }
