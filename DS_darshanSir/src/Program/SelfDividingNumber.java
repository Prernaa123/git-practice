//Self dividing Number
//124
//o/p->yes
//ex:124->4,2,1

//81
//o/p -> No
//ex:- 81 -> but not by 8



package Program;

public class SelfDividingNumber {

	public static void main(String[] args) {
		int n=124,n1=n;
		int rem=0;
		boolean flag = true;
		while(n!=0) {
			rem=n%10;
			if(n1%rem!=0) {
				flag=false;
				break;
			}
			n=n/10;
		}
		System.out.println(flag==true?"yes":"No");

	}

}
