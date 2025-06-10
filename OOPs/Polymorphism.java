public class Polymorphism{

    public static void main(String args[]){
        // Calculator cal = new Calculator();
        //  System.out.println(cal.sum(1,2)); 
        //  System.out.println((cal.sum(1.2f,3.3f)));  
        //   System.out.println(cal.sum(1,2,3)); 
        Human value = new Human();
        value.eat();
        value.eat();
    }
}

// method OverLoading 

class Calculator{
    
    int sum(int a, int b){
        return a+b ;
    }
    float sum(float a, float b){
         return a+b;
    }
    int sum(int a, int b, int c){
          return a+b+c ;
     }

}

// method overriding

class Animal{
    void eat(){
        System.out.println("Eat Something ");
    }
}
class Human extends Animal{
    void eat(){
        System.out.println("Eat Food ");
    }
} 


