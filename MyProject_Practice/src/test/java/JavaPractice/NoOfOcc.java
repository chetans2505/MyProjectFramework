package JavaPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NoOfOcc {
	public static void main(String[] args) {
		
		String s="rain rain come again and again";
		List<String> al=Arrays.asList(s.split(" "));
		Set<String> hs=new HashSet<String>(al);
		for( String uniq:hs){
			System.out.println(uniq+" "+Collections.frequency(al,uniq));
			
		}
	}
}
