package mock1;

public class Ques9 {

	public static void main(String[] args) {
		for(int i=0.0;i<3.0;i++)//Type mismatch: cannot convert from double to int
		{
			switch(i) {
			case 0:break;
		    case 1:System.out.println("one");
			case 2:System.out.println("two");
			case 3:System.out.println("three");
			}
			
		}
	}

}
