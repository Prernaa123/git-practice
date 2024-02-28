package oops1;

public class MethodOverLoading {

		static void m1(int a){
			System.out.println("hi");
		}
		static void m1(int a , int b) {
			System.out.println("bye");
		}
		static void m1(int a , double c) {
			System.out.println("hello");
		}
		static void m1(String s,int a) {
			System.out.println("Ravi");
		}
		public static void main(String[] args) {
			MethodOverLoading.m1(45,90.5);
		}

	}


