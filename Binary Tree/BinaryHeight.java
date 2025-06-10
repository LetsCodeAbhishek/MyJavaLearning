import java.util.*;
public class BinaryHeight{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryT{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }

        Node newNode = new Node (nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
        }

        // Preoreder Traversal
        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // Inorder Traversal:

        public static void inOrder(Node root){
            if(root == null){
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // Postorder

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Level Order Traversal 
    public static void levelOrder(Node root){
        if(root == null ){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data +" ");

                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

    }
    // Height of Tree 
     public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // count of Node 
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount +1 ;
    }
    // Sum of Nodes 

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }

    // Diameter of tree Approach 1:

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam)) ;
    }
    // Approach 2

    // static class Info{
    //     int diam;
    //     int ht;

    //     public Info(int diam, int ht){
    //         this.diam = diam;
    //         this.ht = ht;
    //     }
    // }
    // SubTree of another Tree:

    // public static boolean isSubtree(Node root, Node subRoot){
    //     if(root == null){
    //         return false;
    //     }
    //     if(root.data == subRoot.data){
    //         if(isIdentical(root, subRoot)){
    //             return true;
    //         }
    //     }
    //     return isSubtree(root.left , subRoot) || isSubtree(root.right, subRoot) ;
    // }

    // public static boolean isIdentical(Node node, Node subRoot){
    //     if(node == null && subRoot == null){
    //         return true;
    //     }else if(node == null || subRoot == null || node.data != subRoot.data){
    //         return false;
    //     }
    //     if(!isIdentical(node.left, subRoot.left)){
    //         return false;
    //     }
    //     if(!isIdentical(node.right, subRoot.right)){
    //         return false;
    //     }
    //     return true;
    // }

    // public static Info diameter1(Node root){
    //     if(root == null){
    //         return new Info(0,0);
    //     }
    //     Info leftInfo = diameter1(root.left);
    //     Info rightInfo = diameter1(root.right);

    //     int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
    //     int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1 ;

    //     return new Info(diam , ht);
    // }

// Top View of a Tree:
    static class Info{
        Node node ;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        // Level order

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd -1 ));
                    min = Math.min(min, curr.hd -1 );
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd +1 ));
                    max = Math.max(min, curr.hd +1 );
                }
            }
        }
        for(int i=min ; i<= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();

    }

    public static void main(String args[]){

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            Node root1 = new Node(2);
            root1.left = new Node(4);
            root1.right = new Node(6);

            System.out.println("Height " + height(root));
            System.out.println("--------------");
            levelOrder(root);
            System.out.println("--------------");
            System.out.println("count " + count(root));
            System.out.println("--------------");
            System.out.println("sum " + sum(root));
            System.out.println("--------------");
            System.out.println("Diameter "+ diameter(root));
            System.out.println("--------------");
          //  System.out.println("Diameter "+ diameter1(root).diam);
            //System.out.println("--------------");
           // System.out.println(" Is Identical "+ isSubtree(root ,root1));

            System.out.println("--------------");
            topView(root);

    }
}