import java.util.*;
public class ArraysIntro{

// Arrys Creation:

    public static void Array_Creation(){

    int marks[] = {10,6,30,4,50};

    System.out.println("Numbers "+ marks[0]);

    int len = marks.length;

    System.out.println("Length of Array: "+ len);

    int sum = 0;
    // to print whole Array....
    System.out.print("Full Array: ");
    for(int i=0; i<len; i++){    
        System.out.print(marks[i] + " ");
        sum = sum + marks[i];
        // System.out.print((marks[i]*2) + " ");
    }
    System.out.println();
    System.out.print("Sum of Array is : "+ sum);
    }
//----------------------------------------------------------
// Input And Output in Array. And How to Update Array.
   //public static void Array_input(){

    // int marks[] = new int[100];
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.println("Enter a number: ");
    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();
    //     marks[3] = sc.nextInt();

    //     System.out.println("marks 1: "+ marks[0]);
    //     System.out.println("marks 2: "+ marks[1]);
    //     System.out.println("marks 3: "+ marks[2]);
    //     System.out.println("marks 4: "+ marks[3]);

    //     marks[0] = marks[0] + 12;
    //     marks[1] = marks[1] + 11;

    //     System.out.println(" Updated marks 1: "+ marks[0]);
    //     System.out.println(" Updated  marks 2: "+ marks[1]);
   //}
//-------------------------------------------------------------------------
// print String in an Array :
        
        // public static void ArrayString(){
        //     String str[] = {"Apple", "Mango", "Seb", "Aam", "Maggi", "Biscuit"};
        //     for(int i=0; i<str.length; i++){
        //         if(i%2==0){
        //              System.out.print( str[i] + " ");
        //         }else if(i==0){
        //             System.out.print( str[0] + " ");
        //         }else{
        //             System.out.print( str[i] + " ");
        //         }
               
        //     }
        //     System.out.println();
        // }
//------------------------------------------------------------------------------
// Arrays As a function Argument:  // call by reference
    public static void UpdateMarks(int marks[]){
        for(int i=0; i<marks.length; i++){
             marks[i] = marks[i] + 2;
        } 

    }
    public static void main(String args[]){
        int marks[] = {85,87,89,92,89};
    
        UpdateMarks(marks);
        int sum =0;
        for(int i=0; i<marks.length; i++){
               System.out.print(marks[i] + " ");
               sum = sum + marks[i];
               
        }
        System.out.println();
        System.out.print(sum);



    }
}