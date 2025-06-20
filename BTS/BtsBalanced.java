import java.util.*;
public class BtsBalanced{
    static class Node{
        int data;
        Node right;
        Node left;

        Node (int data){
            this.data =data;
            this.left = this.right = null;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // public static Node createBTS(int arr[], int st, int end){
    //     if(st>end){
    //         return null;
    //     }
    //     int mid = (st + end )/2;

    //     Node root = new Node (arr[mid]);
    //     root.left = createBTS(arr, st, mid-1);
    //     root.right = createBTS(arr, mid+1, end);

    //     return root;
    // }

 // Convert BST to balanced BST:

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBTS(ArrayList<Integer> inorder, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st + end )/2;

        Node root = new Node (inorder.get(mid));
        root.left = createBTS(inorder, st, mid-1);
        root.right = createBTS(inorder, mid+1, end);

        return root;
    }

    public static Node balanceBST(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        root = createBTS(inorder,0, inorder.size()-1);
        return root;
    }

    
    

    public static void main(String args[]){
            Node root = new Node(8);
            root.left = new Node(6);
            root.left.left = new Node(5);
            root.left.left.left = new Node(3);

            root.right = new Node (10);
            root.right.right = new Node(11);
            root.right.right.right = new Node(12);

            root = balanceBST(root);
            preOrder(root);

        // int arr[] = {3,5,6,8,10,11,12};
        // Node root = createBTS(arr, 0, arr.length-1);
        // preOrder(root);
        
       }
}