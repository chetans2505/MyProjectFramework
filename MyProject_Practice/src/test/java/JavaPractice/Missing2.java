package JavaPractice;

public class Missing2 {
	public static void main(String[] args) {
		String s="anNb";
		s=s.toLowerCase();
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length-1;i++){
			int diff = ch[i+1]-ch[i];
			if(diff>0){
				for(int j=1;j<diff;j++){
					char c=(char) (ch[i]+j);
					System.out.print(c);
				}
			}
			
		}	
	}
}