
import java.util.*;
public class DequeQ{

    // Stack using Deque:
    static class Stack{
        Deque<Integer> d = new LinkedList<>();

        public void push(int data){
            d.addLast(data);
        }

        public int pop(){
            return d.removeLast();
        }

        public int peek(){
            return d.getLast();
        }
    }

    // Queue using Deque;
     static class Queue{
        Deque<Integer> q = new LinkedList<>();

        public void add (int data){
            q.addLast(data);
        }

        public int remove(){
            return q.removeFirst();
        }

        public int peek(){
            return q.getFirst();
        }
     }

    public static void main(String args[]){
     //    Deque <Integer> d = new LinkedList<>();
        // d.addFirst(1);
        // d.addLast(2);
        // d.addLast(3);
        // d.addFirst(4);

        // Stack d = new Stack();
        // d.push(1);
        // d.push(2);
        // d.push(3);
        // System.out.println("peek = "+ d.peek());
        // System.out.println(d.pop());
        // System.out.println(d.pop());
        // System.out.println(d.pop());

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println( "Peeek " + q.peek());
        

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());


    }
}