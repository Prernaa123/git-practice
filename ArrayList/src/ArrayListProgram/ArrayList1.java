//WAJP to remove duplicate from arrayList

package ArrayListProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(100);
		l1.add(102);
		l1.add(100);
		l1.add(56);
		l1.add(200);
		l1.add(150);
		l1.add(56);
		l1.add(100);
		//convert ArrayList into set to remove duplicate
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>(l1);
		System.out.println(s1);
		
		//convert set into ArrayList
		ArrayList<Integer> ans = new ArrayList<Integer>(s1);
		System.out.println(ans);
	}

}
