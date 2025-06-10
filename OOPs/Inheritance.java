public class Inheritance{
    public static void main(String args[]){
        // Fish stark = new Fish();
        // stark.eat();
        // stark.breathe();
        // stark.swim();

        // Dog po = new Dog();

        // po.eat();   

        // po.human = "Abhi ";
        // System.out.println(po.human);

        // po.legs = 2;
        // System.out.println(po.legs);

        Mammal hu = new Mammal();
        hu.walk();
        Bird black = new Bird();
        black.fly();
        Fish fi = new Fish();
        fi.swims();

    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("Eats.. ");
    }

    void breathe(){
        System.out.println("breathes... ");
    }
}

// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims...")  ;
//           }
// }



// class Mammal extends Animal{
//     String human;
// }

// class Dog extends Mammal{
//      int legs;
// }
   
class Mammal extends Animal{
    String Walk;

    void walk(){
        System.out.println("walk ");
    }
     
}

class Fish extends Animal{
    String Swims;
    void swims(){
        System.out.println("Swims...");
    }
}

class Bird extends Animal{
    String Fly;
    void fly(){
        System.out.println("fly... ");
    }
}

