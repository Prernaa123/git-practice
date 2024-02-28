package binarySearch;

public class BstImpl {
	void insert(Node root,int ele) {
		if(root.data>ele) {
			if(root.left==null) {
				root.left=new Node(ele);
				System.out.println(ele+" had been added towards left of "+root.data);
			}
			else {
				insert(root.left,ele);
			}
		}
		else {
			if(root.right==null) {
				root.right=new Node(ele);
				System.out.println(ele+" had been added towards right of "+root.data);
			}
			else {
				insert(root.right,ele);
			}
		}
	}
	void preOrder(Node root) {
		if(root!=null) {
			System.out.println(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.data+" ");
			inOrder(root.right);
		}
	}
	void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data+" ");
			
		}
	}
}
