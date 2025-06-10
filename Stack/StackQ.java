import java.util.*;
public class StackQ{

    // Push At the Bottom
    public static void pushAtBottom(Stack <Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    // Reverse A String 

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            res.append(curr);
        }
        return res.toString();
    }
    // Reverse a stack 

    public static void reverseStack(Stack <Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    // stock Span Problem (*)

    public static void StockSpan(int stocks[], int span []){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        } 
    }

    // Next Greater Element :

    

    public static void main(String args[]){
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

        // String str = "asb";
        // String result = reverseString(str);
        // System.out.println(result +" ");

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // reverseStack(s);
        // printStack(s);
        // int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        // int span [] = new int[stocks.length];
       // StockSpan(stocks, span);

       // for(int i=0; i<span.length; i++){
       //     System.out.println(span[i]+" ");
       // }
       int arr[] = {6, 8, 0, 1, 4};
       Stack<Integer> s = new Stack<>();
       int nxtGreater [] = new int [arr.length];

       for(int i= arr.length-1 ; i>=0; i--){

          while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
          }

          if(s.isEmpty()){
            nxtGreater[i] = -1;
          }else{
            nxtGreater[i] = arr[s.peek()];
          }

          s.push(i);
       }
       
       for(int i=0; i<nxtGreater.length; i++){
        System.out.print(nxtGreater[i] + " ");
       }
       
       System.out.println();
        } 

}