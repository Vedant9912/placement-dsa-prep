/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> arr =new  ArrayList<Integer>();
    void inorder(Node root){
            if (root==null) return;
            inorder(root.left);
            arr.add(root.data);
            inorder(root.right);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        inorder(root);
        return arr;
        
            
        }
    
}
