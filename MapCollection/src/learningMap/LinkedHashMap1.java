package learningMap;
import java.util.LinkedHashMap;
public class LinkedHashMap1 {
	public static void main(String[] args) {
		
		LinkedHashMap<Character,String>  h1 = new LinkedHashMap<Character,String>();
		h1.put('a',"shashi");
		h1.put('j',"jash");
		h1.put('p',"piyush");
		h1.put('y',"yogesh");
		
		for(Character ele:h1.keySet()) {
			System.out.println(h1.get(ele));
		}
			
	}
}
