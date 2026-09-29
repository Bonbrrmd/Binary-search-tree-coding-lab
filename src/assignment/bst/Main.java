
package assignment.bst;


public class Main {
    
    public static void main(String[] args) {
        
        BST t = new BST();
        int[] vals = {50, 30, 70, 20, 40, 60, 80};
        
        for(int i = 0; i < vals.length; i++) {
            t.insert(vals[i]);
            
        }
        System.out.print("Inorder after insertion: ");
        t.inorderPrint();
     
        
        if (t.search(t.root, 40)) {
             System.out.println("Search 40: Found");
          } else {
            System.out.println("Search 40: Not Found");
        }
        
        if (t.search(t.root, 100)) {
             System.out.println("Search 100: Found");
          } else {
            System.out.println("Search 100: Not Found");
            
       }
             t.deletekey(20);
             System.out.print("After Deleting: ");
             t.inorderPrint();
             
             
             t.deletekey(30);  
             System.out.print("After Deleting: ");
             t.inorderPrint();
             
             
             t.deletekey(50);
             System.out.print("After Deleting: ");
             t.inorderPrint();
       
            
    }
}

