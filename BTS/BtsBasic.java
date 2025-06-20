import java.util.*;
public class BtsBasic{
    static class Node{
        int data;
        Node right;
        Node left;

        Node (int data){
            this.data =data;
        }
    }
    public static void inOrder(Node root){
        if(root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node (val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left , val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Delete a Node:

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            // Voila 
            // case -1 leaf node

            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 single child 

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 both chlidren

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // Print in Range

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return ;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1 , k2);
            System.out.print(root.data +" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }

    // Root to leaf path

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        path.remove(path.size() -1);
    }

    // Validate Bst:

    public static boolean isValidBST(Node root, Node min , Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min , root) && isValidBST(root.right , root ,max);
    }

    public static void main(String args[]){
        int value[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<value.length; i++ ){
            root = insert(root, value[i]);
        }
         inOrder(root);
         System.out.println();

        //  root = delete(root, 1);
        //  System.out.println();
        //  inOrder(root);

        //printInRange(root, 5, 12);

       // printRoot2Leaf(root, new ArrayList<>());

       if(isValidBST(root, null, null)){
        System.out.print("valid");
       }else{
        System.out.println("not valid");
       }
    }
}