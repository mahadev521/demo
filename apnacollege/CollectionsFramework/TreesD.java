import java.util.*;
public class TreesD {
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

    
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }

    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    public static int maxHeight(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxHeight(root.left),maxHeight(root.right));
    }

    public static int minHeight(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.min(minHeight(root.left),minHeight(root.right));
    }

    public static int maxWidth(Node root){
        if(root==null){
            return 0;
        }
        int maxWidth=0;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                if(!q.isEmpty()){
                    q.add(null);
                    maxWidth=Math.max(maxWidth,q.size());
                }
            }
            else{
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        return maxWidth;
    }

    public static int minWidth(Node root){
        if(root==null){
            return 0;
        }
        int minWidth=0;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                if(!q.isEmpty()){
                    q.add(null);
                    minWidth=Math.min(minWidth,q.size());
                }
            }
            else{
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        return minWidth;
    }

    public static int countLeaves(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return countLeaves(root.left)+countLeaves(root.right);
    }

    public static int countFullNodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.right!=null){
            return 1+countFullNodes(root.left)+countFullNodes(root.right);
        }
        return countFullNodes(root.left)+countFullNodes(root.right);
    }

    public static int countHalfNodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.right==null || root.left==null && root.right!=null){
            return 1+countHalfNodes(root.left)+countHalfNodes(root.right);
        }
        return countHalfNodes(root.left)+countHalfNodes(root.right);
    }

    public static int countOneChildNodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.right==null || root.left==null && root.right!=null){
            return 1+countOneChildNodes(root.left)+countOneChildNodes(root.right);
        }
        return countOneChildNodes(root.left)+countOneChildNodes(root.right);
    }

    public static int countTwoChildNodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.right!=null){
            return 1+countTwoChildNodes(root.left)+countTwoChildNodes(root.right);
        }
        return countTwoChildNodes(root.left)+countTwoChildNodes(root.right);
    }

    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static TreeInfo diameter(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo leftInfo=diameter(root.left);
        TreeInfo rightInfo=diameter(root.right);
        int ht=1+Math.max(leftInfo.ht,rightInfo.ht);
        int diam=Math.max(leftInfo.diam,rightInfo.diam);
        diam=Math.max(diam,leftInfo.ht+rightInfo.ht+1);
        return new TreeInfo(ht,diam);
    }
    
    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);   
        preOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        levelOrderTraversal(root);
        System.out.println("number of nodes "+countNodes(root));
        System.out.println("sum of nodes "+sumOfNodes(root));
        System.out.println("max height "+maxHeight(root));
        System.out.println("min height "+minHeight(root));
        System.out.println("max width "+maxWidth(root));
        System.out.println("min width "+minWidth(root));
        System.out.println("count leaves "+countLeaves(root));
        System.out.println("count full nodes "+countFullNodes(root));
        System.out.println("count half nodes "+countHalfNodes(root));
        System.out.println("count one child nodes "+countOneChildNodes(root));
        System.out.println("count two child nodes "+countTwoChildNodes(root));
        TreeInfo info=diameter(root);
        System.out.println("diameter "+info.diam);
    }
    
}
