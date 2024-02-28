package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		File obj = new File("C:\\Users\\asus\\OneDrive\\Desktop\\JavaBasics\\FileHandling\\src\\myfile.txt");
		try {
			obj.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//write a file
		try {
			FileWriter write = new FileWriter("C:\\Users\\asus\\OneDrive\\Desktop\\JavaBasics\\FileHandling\\src\\myfile.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your msg");
			String msg = sc.nextLine();
			write.write(msg);
			write.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	// read file
		
		try {
			Scanner sc1 = new Scanner(obj);
			while(sc1.hasNext()) {
				String lines = sc1.nextLine();
				System.out.println(lines);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		//delete file
		if(obj.delete())
		{
		System.out.println("file deleted");	
		
		}
		else {
			System.out.println("problem to deleted fileg");
		}
	}

}
