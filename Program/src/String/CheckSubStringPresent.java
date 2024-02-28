package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSubStringPresent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the main String");
		String ms = sc.nextLine();
		System.out.println("enter sub string");
		String ss = sc.nextLine();
//1.	
		Pattern p =Pattern.compile(ss);
		Matcher m=p.matcher(ms);
		int count=0;
		while(m.find()) {
			count++;
		}
		System.out.println(count);
		
//2.
//		boolean rs = isPresent(ms,ss);
//		if(rs==true)
//			System.out.println("present");
//		else
//			System.out.println("not");
//
//	}
//	
//	static boolean isPresent(String ms ,String ss)
//	{
//		for(int i=0;i<ms.length();i++) {
//			int j=i;int count=0;
//			while(i<ms.length()&&j<ss.length()&& ms.charAt(i)==ss.charAt(j))
//			{
//				count++;
//				i++;
//				j++;
//				
//			}
//			
//			if(j==ss.length())
//				return true;
//			
//		}
//		return false;
	}

}
