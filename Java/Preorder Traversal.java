/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> arr = new ArrayList<>(); 
    void preorder(Node root){
        if ( root == null) return;
        arr.add(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public ArrayList<Integer> preOrder(Node root) {
        arr.clear();
        preorder(root);
        return arr;
        
        
    }
}
