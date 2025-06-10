public class Abstraction{
    public static void main(String args[]){
        Human ab = new Human();

        // Dog d = new Dog();
        // System.out.println(d.color);
        
        // Dog d = new Dog();
        // d.eat();
        // d.walk();
      
    }
}


abstract class Animal{
    String color;

    Animal(){
        color="blue";
        System.out.println("Animal ");
    }

    void eat(){
        System.out.println("Eat Health ");
    }
    abstract void walk();
}

class Human extends Animal{

    Human(){
        color="green";
                System.out.println("human");
    }

    void changeColor(){
        color="Black";
    }

    void walk(){
        System.out.println("Human Walk ");
    }
}

class Dog extends Animal{

   
    void walk(){
        System.out.println("Dog walk ");
    }
}

