//student id is 8 more than 3 times -->luck student else unlucky student

package Revision;

public class Pro1 {

	public static void main(String[] args) {
		int sid = 458883484;
		int rem = 0,c=0;
		while(sid!=0) {
			rem = sid%10;
			if(rem==8) {
				c++;
			}
			sid=sid/10;
		}
		if(c>3) {
			System.out.println("lucky student");
		}
		else {
			System.out.println("Not a lucky student");
		}

	}

}
