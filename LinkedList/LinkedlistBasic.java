import java.util.*;
public class LinkedlistBasic{

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

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if((head == null)){
            head = tail = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
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

    // Middle 

    public void add(int i, int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int j= 0;
        while(j < i-1){
            temp = temp.next;
            j++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty ");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty ");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--; 
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i=0; 
        while(temp!= null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recursive Search
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0; 
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSeatch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and Remove Nth node from end:

    public void deleteN(int n){
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
            return;
        }

        int i=1;
        int toFind = sz-n;
        Node prev = head ;
        while (i<toFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
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

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]){
        LinkedlistBasic list1 = new LinkedlistBasic();

        // list1.print();
        // list1.addFirst(3);
        // list1.print();
        // list1.addFirst(2);
        // list1.print();
        // list1.addFirst(1);
        // list1.print();
        // list1.addLast(6);
        // list1.print();
        // list1.addLast(7);
        // list1.print();
        // list1.add(3,4);
        // list1.print();
        // list1.add(4,5);
        // list1.print();
        // list1.removeFirst();
        // list1.print();
        // list1.removeLast();
        // list1.print();

        // list1.reverse();
        // list1.print();

        // int r = list1.recSeatch(6);
        // System.out.println(r);
        // System.out.println(list1.recSeatch(10));
        
        //System.out.println("Listedlist size "+ size);

        // list1.deleteN(3);
        // list1.print();

        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(2);
        list1.addLast(1);
        list1.print();
        System.out.println(list1.checkPalindrome());
    }
}