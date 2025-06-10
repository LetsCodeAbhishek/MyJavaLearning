import java.util.*;
public class PalindromeLL{


        public static class Node{
        int data;
        Node next;

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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //Step 1
        Node midNode = findMid(head);

        // Step 2

        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step 3

        while(right != null && left != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]){
        PalindromeLL list1 = new PalindromeLL();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(2);
        list1.addLast(2);

        list1.print();
         boolean i = list1.checkPalindrome();
         System.out.print(i);
        
    }
}