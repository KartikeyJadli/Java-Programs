import java.util.*;

class Node{
	int item;
	Node left,right;

	Node(int key){

		item = key;
		right = left = null;
	}
}

class BinaryTree{
	Node root;

	BinaryTree(){
		root = null;
	}

	void postorder(Node node){
		if(node == null)
			return;
		
		postorder(node.left);

		postorder(node.right);

		System.out.print(node.item + "->");
	}	

	void inorder(Node node){
		if(node == null)
			return;

		inorder(node.left);
		System.out.print(node.item + "->");
		inorder(node.right);
	}

	void preorder(Node node){
		if(node == null)
			return;

		System.out.print(node.item + "->");
		preorder(node.left);
		preorder(node.right);
	}
}

public class Tree{
	public static void main(String arg[]){
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.print("Postorder: ");
		tree.postorder(tree.root);

		System.out.print("\nInorder: ");
		tree.inorder(tree.root);

		System.out.print("\nPreorder: ");
		tree.preorder(tree.root);
	}
}