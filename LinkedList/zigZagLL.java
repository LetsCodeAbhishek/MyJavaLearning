import java.util.*;
public class zigZagLL{

    public static class Node{
        int data ;
        Node next ; 

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode = new Node(data);
        
        if((head == null)){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("ListedList is Empty ");
            return ;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void zigzag(){
        // find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd Half 

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr!= null){
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        // alt merge - zig zag merge

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String args[]){
        //LinkedList<Node> ll = new LinkedList<>();
        zigZagLL list1 = new zigZagLL();

        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);

        list1.print();

        list1.zigzag();
        list1.print();

        
        
         
    }

}