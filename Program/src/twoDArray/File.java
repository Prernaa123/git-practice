package twoDArray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(f);
		String s="";
		int l=0;//lines
		int w=0;//words
		while((s=br.readLine())!=null) {
			String[] arr = s.split(" ");
			System.out.println(s);
			w=w+arr.length;
			l++;
		}
		System.out.println("no of lines:"+l);
		System.out.println("no of words:"+w);
//		System.out.println(br.readLine());//1
//		System.out.println(br.readLine());//2
//		System.out.println(br.readLine());//3
//		System.out.println(br.readLine());//4
//		System.out.println(br.readLine());//5
//		System.out.println(br.readLine());//6
	}
	
}
