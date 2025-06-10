public class Classobject{
    public static void main(String args []){
        // Pen p1 = new Pen(); // object
        // p1.setColor("red");
        // System.out.println(p1.getColor());

        // p1.setTip(5);
        // System.out.println(p1.tip);

        // p1.setColor("blue");
        // System.out.println(p1.getColor());

        // p1.tip = 2;
        // System.out.println(p1.tip);

        //  BankAccount ba = new BankAccount();
                  
        //  ba.setP("abcd");
        //  System.out.println(ba.getP());

        Student s= new Student();
        s.name = "abhiss";
        s.rollNo = 11;
        s.marks[0] = 200;
        s.marks[1] = 1100;
        s.marks[2] = 2121;
        // Student s1= new Student();
        // Student s2= new Student(111);
        // System.out.println(s.rollNo);
        // System.out.println(s.name);
        
        Student s1 = new Student(s);
        
        System.out.println(s1.name);
        System.out.println(s1.rollNo + "-----------");
        s.marks[1] =1;

        for(int i=0; i<3;i++){
            System.out.println(s1.marks[i]);
        }


    }

}
// Constructor 
class Student{
    String name;
    int rollNo;
    int marks[];

    // shallow 
    //copy Constructor
    // Student(Student s){
    //     this.name = s.name;
    //     this.rollNo = s.rollNo;
    //     this.marks = s.marks; 
    // }

    // deep copy constructor

     Student(Student s){
        this.name = s.name;
        this.rollNo = s.rollNo;
        marks = new int[3]; 
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s.marks[i];
        }
    }


    // non Parameterized 
    Student(){
         System.out.println("yo");
         marks = new int[3];
    }

    // Parameterized
    Student(String name){
         this.name = name;
         marks = new int[3];
    }
    Student(int rollNo){
        this.rollNo = rollNo;
        marks = new int[3];
    }
}



// Access Modifier:
class BankAccount{
    public String username;
    private String password;

// getter Function
    String getP(){
        return this.password;
    }
// Setter function
    public void setP(String pwd){
        password = pwd;
    }
    
}

class Pen{
    private String color;
    int tip;

    //getter 
    String getColor(){
        return this.color;
    }
    // setter
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip; 
    }
}