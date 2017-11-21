package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


	
		class StringOcc2
		{
		    static void characterCount(String inputString)
		    {
		        //Creating a HashMap containing char as a key and occurrences as  a value
		 
		        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		 
		        //Converting given string to char array
		 
		        char[] strArray = inputString.toCharArray();
		 
		        //checking each char of strArray
		        System.out.println(strArray);
		 
		        for (char c : strArray)
		        {
		            if(charCountMap.containsKey(c))
		            {
		                //If char is present in charCountMap, incrementing it's count by 1
		 
		                charCountMap.put(c, charCountMap.get(c)+1);
		            }
		            else
		            {
		                //If char is not present in charCountMap,
		                //putting this char to charCountMap with 1 as it's value
		 
		                charCountMap.put(c, 1);
		            }
		        }
		 
		        //Printing the charCountMap

				System.out.println(charCountMap);
		       for(Map.Entry<Character, Integer> val:charCountMap.entrySet()){
		    	  System.out.print(val.getValue()+""+val.getKey());
		    	  //System.out.print(charCountMap.get(val));
		    	   
		       }
		    }
		 
		    
		    public static void main(String[] args)
		    {
		       /*characterCount("Java J2EE Java JSP J2EE");
		 
		       characterCount("All Is Well");
		 
		       characterCount("Done And Gone");*/
		       characterCount("aaaabbccccdddd");
		    
		}
	

}
