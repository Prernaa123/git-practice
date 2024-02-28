package com;
import java.util.Scanner;
public class CheckDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date,month and year:");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		
		if(d<1||d>31||m<1||m>12||y<1)//d=day,m=month,y=year
			System.out.println("invalid date");
		else if((m==4||m==6||m==9||m==11)&&d>30)//month = 30
			System.out.println("invalid date");
		else if(!(y%4==0 && y%100!=0 || y%400==0)&&m==2&&d>28)
			System.out.println("invalid date");
		else if((y%4==0 && y%100!=0 || y%400==0)&&m==2&&d>29)
			System.out.println("invalid date");
		else
			System.out.println("valid date");
	}

}
