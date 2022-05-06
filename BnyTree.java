import java.util.*;

class Node{
	int item;
	
	Node right,left;

	Node(int key){
		item = key;
		left = right = null;	
	}
}

class Binary{
	Node root;

	Binary(int key){
		root = new Node(key);
	}

	Binary(){
		root = null;
	}

	void postorder(Node node){
		if(node != null){
			postorder(node.left);
			postorder(node.right);
			System.out.printf("->" + node.item);
		}	
	}
}

public class BnyTree{

	public static void main(String arg[]){
		Binary tree = new Binary();

		tree.root = new Node(12);
	
		tree.root.left = new Node(10);
		tree.root.right = new Node(11);

		tree.root.left.left = new Node(19);

		System.out.printf("Postorder:");
		tree.postorder(tree.root);	
	}
}