package Revision;

public class ExcetionMain {

	public static void main(String[] args) {
//		ArithmeticException e1 = new ArithmeticException();
//		ArithmeticException e2 = new ArithmeticException("invalid");
//		MyArithmeticException e3 = new MyArithmeticException("hi");
//		String s1 = e1.getMessage();
//		String s2 = e2.getMessage();
//		String s3 = e3.getMessage();
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		ArithmeticException e1 = new ArithmeticException();
		ArithmeticException e2 = new ArithmeticException("invalid");
		MyArithmeticException e3 = new MyArithmeticException("hi");
		Object o1 = new Object();
		
		System.out.println(o1 instanceof Object);//true
		System.out.println(o1 instanceof Throwable);//false
		System.out.println(e1 instanceof Exception);//true
		System.out.println(e1 instanceof Throwable);//true
		System.out.println(e2 instanceof Throwable );//true
		//throw e1;
	}

}
