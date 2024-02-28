//WAJP to Union Of String Of Array
//n->4
//{"virat","rahul","pandya","dhoni"}
//m->5
//{"rohit","rahul","rishab","dhoni","yuvi"}

//union
//o/p->{"virat","rahul","pandya","dhoni","rohit","rishab","yuvi"}



package ArrayListProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UnionOfStringOfArray {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		Scanner ip = new Scanner(System.in);
		int n = ip.nextInt();
		for(int i=1;i<=n;i++) {
			String ele = ip.next();
			l1.add(ele);
		}
		int m = ip.nextInt();
		for(int i=1;i<=m;i++) {
			String ele = ip.next();
			l2.add(ele);
		}
		LinkedHashSet<String> s1 = new LinkedHashSet<String>(l1);
		for(String ele:l2) {
			s1.add(ele);
		}
		System.out.println(s1);
		
	}

}
