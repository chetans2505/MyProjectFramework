package JavaPractice;


import java.util.HashMap;
import java.util.Map.Entry;


public class StringOcc3 {
	
	
	public static HashMap<Character, Integer> countString(String str){
		
		HashMap<Character , Integer> stringCount=new HashMap<Character, Integer>();	
		char[] strVals = str.toCharArray();
		for(char ch:strVals){
			if(stringCount.containsKey(ch)){
				stringCount.put(ch, stringCount.get(ch)+1);
			}
			else
				stringCount.put(ch, 1);
			
		}
		for(Entry<Character, Integer> val:stringCount.entrySet()){
			System.out.print(val.getValue()+""+val.getKey());
			
		}
		System.out.println();
		
		
		return stringCount;
	}
	public static void main(String[] args) {
		System.out.println(countString("aaabcccdd"));
	}

}
