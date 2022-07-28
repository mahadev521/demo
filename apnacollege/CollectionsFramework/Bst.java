public class Bst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //searching a node
    public static boolean contains(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(val<root.data){
            return contains(root.left,val);
        }
        else{
            return contains(root.right,val);
        }
    }


    public static void main(String[] args) {
        int[] nodes={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<nodes.length;i++){
            root=insert(root,nodes[i]);
        }
        System.out.println(root.data);
        inorder(root);
        System.out.println();
        System.out.println(contains(root,3));
    }
}
