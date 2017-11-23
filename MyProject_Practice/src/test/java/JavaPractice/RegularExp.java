package JavaPractice;

public class RegularExp {
public static void main(String[] args) {
	String Str1="!@#$!@#$!@#$!@#$wqreypiwererQWERTYuootuihhklhljlhjtrgfdfknfd";
//	System.out.println(Str1.length());
//	String[] strArr=Str1.split("");
//	System.out.println(strArr.length);
	
	
	Str1=Str1.replaceAll("[^A-Z]", "");
	System.out.println(Str1);
}
}
