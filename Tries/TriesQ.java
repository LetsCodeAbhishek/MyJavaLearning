import java.util.*;
public class TriesQ{
    static class Node{
        Node childern[] = new Node[26];
        boolean eow = false;
        int freq;

        Node() {
            for(int i=0; i<childern.length; i++){
                childern[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.childern[idx]== null){
                curr.childern[idx] = new Node();
            }else{
                curr.childern[idx].freq++;
            }
            curr = curr.childern[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.childern[idx] == null){
                return false;
            }
            curr = curr.childern[idx];
        }
        return curr.eow == true;
    }

    public static void findPrefix(Node root, String ans){
        if(root == null){
            return ;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<root.childern.length; i++){
            if(root.childern[i] != null){
                findPrefix(root.childern[i], ans + (char)((i + 'a')) );
            }
        }
    }
    // StarsWith Problem 
    public static boolean StarsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.childern[idx] == null){
                return false;
            }
            curr = curr.childern[idx];
        }
        return true;
    }   
    // Count Uniqe SubString:
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(root.childern[i] != null){
                count += countNodes(root.childern[i]);
            }
        }
        return count + 1;
    }
    // Largest word with all prefixes:

    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return ;
        }
        for(int i=0; i<26; i++){
            if(root.childern[i] != null && root.childern[i].eow == true){
                char ch = (char)(i+ 'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.childern[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String args[]){
        // String arr[] = {"zebra", "dog", "dove", "duck"};
        // for(int i=0; i<arr.length; i++){
        //     insert(arr[i]);
        // }
        // root.freq = -1;
        // findPrefix(root, "");

        // String arr[] = {"apple", "app", "mango", "man", "woman"};
        // String prefix1 = "apple";
        // String prefix2 = "man";

        // for(int i=0; i<arr.length; i++){
        //     insert(arr[i]);
        // }
        // System.out.println(StarsWith(prefix1));
        // System.out.println(StarsWith(prefix2));

        // String str = "apple";

        // // Suffix
        // for(int i=0; i<str.length(); i++){
        //     String suffix = str.substring(i);
        //     insert(suffix);
        // }
        // System.out.println(countNodes(root));

        String words[] = {"a", "banana", "app", "appl", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}