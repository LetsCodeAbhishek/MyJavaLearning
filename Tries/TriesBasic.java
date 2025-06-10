import java.util.*;
public class TriesBasic{
    static class Node{
        Node childern[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<26; i++){
                childern[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int level = 0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.childern[idx]== null){
                curr.childern[idx] = new Node();
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

    // Word Break Problem
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        // String words[] = {"the", "a", "there", "their", "any", "thee"};
        // for(int i=0; i<words.length; i++){
        //     insert(words[i]);
        // }     
        // String k = "any";
        // System.out.println("Search -> "+ search(k)); 

        String arr[] = {"i", "like", "sam", "samsumg", "mobile", "ice"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        } 
        String key = "ilikesa";
        System.out.println(wordBreak(key));
    }
}