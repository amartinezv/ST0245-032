
/**
 * 
 * @author Alejadra MArtinez Vega 
 * 
 * */
public class BinarySearchTree
{
    public class Node{
        public BinarySearchTree left;
        public BinarySearchTree right;
        public int data;
        public  Node (){
            data = 0; 
        }
    }

    Node root;
    public BinarySearchTree(){
        root = null; 
    }

    public void Insert(int data){
        if (root == null) {
            Node nuevo = new Node();
            nuevo.data = data;
            nuevo.right = new BinarySearchTree();
            nuevo.left = new BinarySearchTree();
            root = nuevo;
        }else if (data > root.data) {
            (root.right).Insert(data);
        } else if (data < root.data){
            (root.left).Insert(data);
        }
    }

    public BinarySearchTree Search(int data){
        BinarySearchTree nuevo = null;
        if (root != null) {
            if (data == root.data) {
                return this;
            } if (data < root.data) {
                nuevo = root.left.Search(data);
            }else {
                nuevo = root.right.Search(data);
            }
        }
        return nuevo;
    }

}