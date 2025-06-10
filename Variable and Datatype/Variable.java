import java.util.*;

public class Variable{
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        int pen  = sc.nextInt();
        int pencil = sc.nextInt();
        int eraser =sc.nextInt();
        float gst = (float)((pen+pencil+eraser)*0.18);

        float bill = (float)((pen+pencil+eraser)+gst) ;
        
        System.out.println("Your Bill (with 18% gst) is  "+ bill);

        // int a = 5;
        // String b = "abhishek";

        // System.out.println(a+b);



        // System.out.println(bill);
    }
}

