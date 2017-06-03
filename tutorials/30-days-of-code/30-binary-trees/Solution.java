import java.io.*;
import java.util.*;

class Node{
    Node left,right;
    int data;
    
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution{

    static void levelOrder(Node root){
	if (root != null) {
	    Queue<Node> q = new LinkedList<Node>();
          
	    // enqueue the current root
	    q.add(root);
          
	    while (! q.isEmpty()) {
		Node curr = q.remove();
		System.out.print(curr.data + " ");
              
		// enqueue child elements from next level in order
		if (curr.left != null) {
		    q.add(curr.left);
		}
              
		if (curr.right != null) {
		    q.add(curr.right);
		}
	    }
	}
      
    }
    
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;

            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
	    
            return root;
        }
    }
    
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	Node root=null;
	
	while(T-->0){
	    int data=sc.nextInt();
	    
	    root=insert(root,data);
	}
	
	levelOrder(root);
    }	
}    
