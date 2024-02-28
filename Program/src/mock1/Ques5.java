package mock1;

public class Ques5 {

	public static void main(String[] args) {
		int index=0;
		boolean flag = true;
		boolean a = false,b;
		b=(flag|((index++)==0));
		b=(a|((index+=2)>0));
		System.out.println(index);

	}

}
