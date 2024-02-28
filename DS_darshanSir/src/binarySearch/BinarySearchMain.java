package binarySearch;

public class BinarySearchMain {

	public static void main(String[] args) {
		// 50,30,10,40,80,70,90
		Node root = new Node(50);
		BstImpl b1 = new BstImpl();
		b1.insert(root,30);
		b1.insert(root,50);
		b1.insert(root,10);
		b1.insert(root,40);
		b1.insert(root,80);
		b1.insert(root,70);
		b1.insert(root,90);
		System.out.print("======pre Order=====");
		b1.preOrder(root);
		System.out.println();
		
		System.out.print("======in Order======= ");
		b1.inOrder(root);
		System.out.println();
		
		System.out.print("=====post Order=======");
		b1.postOrder(root);
		System.out.println();
		
		

	}

}
