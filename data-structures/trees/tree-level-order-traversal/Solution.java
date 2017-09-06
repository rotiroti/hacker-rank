   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
  void levelOrder(Node root) {
    
           if (root != null) {
               Queue<Node> q = new LinkedList<Node>();       
               q.add(root);
           
               while (!q.isEmpty()) {
                   Node curr = q.poll();           
                   System.out.print(curr.data + " ");
    
                   if (curr.left != null) {
                       q.add(curr.left);               
                   }
    
                   if (curr.right != null) {
                       q.add(curr.right);
                   }
               }             
           }       
       }
    