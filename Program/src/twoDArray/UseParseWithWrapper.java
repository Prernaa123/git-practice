package twoDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseParseWithWrapper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n=Integer.parseInt(br.readLine());
		double d = Double.parseDouble(br.readLine());
		System.out.println(d);

	}

}
