package JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StringOcc4 {
public static void main(String[] args) {
	
	String str="aaabbc";	
	HashMap<Character,Integer> al=new HashMap<Character,Integer>();
	char[] strArr = str.toCharArray();
	for(char ch:strArr){		
			if(al.containsKey(ch)){				
				al.put(ch,al.get(ch)+1);
			}
			else{
				al.put(ch,1);
			}
	}
	System.out.println(al);
	
	for(Map.Entry<Character, Integer> charvals:al.entrySet()){
		System.out.print(charvals.getValue()+""+charvals.getKey()+" ");
	}
}
	 
}
