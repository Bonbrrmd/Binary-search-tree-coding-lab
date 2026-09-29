
package assignment.bst;

public class BST {
    BSTNode root; 
    
    public void insert(int key) {
        root = insertRec(root, key);
    }
    
    private BSTNode insertRec(BSTNode n, int k) {
        if(n == null) 
            return new BSTNode(k);
        
        else if (k < n.key)
            n.left = insertRec(n.left, k);
                    
        else if (k > n.key)
            n.right = insertRec(n.right, k);
        
        return n;
        
        
  }
    public boolean search(BSTNode n, int k) {
        
        if (n == null)
            return false;
        
        if(n.key == k) 
            return true;
        
        if (k  < n.key)
            return search(n.left, k);
        else 
            return search(n.right, k);
            
    } 
    public void deletekey(int key) {
     root = deleteRec(root, key);
        
    }
       private BSTNode deleteRec(BSTNode n, int k) {
       
        if (n == null) {
            return null; 
        }
        
        if (k < n.key) {
            n.left = deleteRec(n.left, k);
        }            
        else if (k > n.key) {
            n.right = deleteRec(n.right, k);
        } else {
            
            if (n.left == null) {
                return n.right;
            }
            if (n.right == null) {
                return n.left;
            } 
            
           
            n.key = minValue(n.right);
            
            n.right = deleteRec(n.right, n.key);          
        }
       
        return n; 
    }

    private int minValue(BSTNode n) {
        
        while (n.left != null) {
            n = n.left;
        }
        return n.key;
    }

    
    void inorderPrint(){
        inorder(root);
        System.out.println();
        
    }
    void inorder(BSTNode n) {
   
    if (n != null) {
        inorder(n.left);               
        System.out.print(n.key + " "); 
        inorder(n.right);             
    }
  
}    
}
    
   



