import java.util.*;

class Node{
	int key;
	Node left = null;
    	Node right = null;
}

class BinaryTree{
	Node root;
	static Queue<Node> Q = new LinkedList<>();

	BinaryTree(){
		root = null;
	}
	
	Node newNode(int value){
        	Node n = new Node();
        	n.key = value;
        	n.left = null;
        	n.right = null;
        	return n;
	}
	
	// Insert values on runtime
	int insert(int value){
        	
                Node node = newNode(value);
                if(root == null)
                    root = node;
                     
                else if(Q.peek().left == null)
                    Q.peek().left = node;  
                
                else{
                    Q.peek().right = node;
                    Q.remove();
                }
                
                Q.add(node);

		return 0;
	}
	
	void create(int arr[],int n){
        	for(int i=0;i<n;i++){
                	insert(arr[i]);   
        	}   
	}

	void postorder(Node node){
		if(node == null)
			return;
		
		postorder(node.left);

		postorder(node.right);

		System.out.print(node.key + "->");
	}	

	void inorder(Node node){
		if(node == null)
			return;

		inorder(node.left);
		System.out.print(node.key + "->");
		inorder(node.right);
	}

	void preorder(Node node){
		if(node == null)
			return;

		System.out.print(node.key + "->");
		preorder(node.left);
		preorder(node.right);
	}
}

public class Tree{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();

		System.out.print("Enter the number of elements in Tree: ");
		int n = sc.nextInt();

		int value;
		int arr[] = new int[n];

		System.out.print("Enter values to insert in the tree: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

        	tree.create(arr,n);
		/*tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);*/

		System.out.print("Postorder: ");
		tree.postorder(tree.root);

		System.out.print("\nInorder: ");
		tree.inorder(tree.root);

		System.out.print("\nPreorder: ");
		tree.preorder(tree.root);
	}
}
