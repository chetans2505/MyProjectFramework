package JavaPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Coll1 {
public static void main(String[] args) {
	
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("chet");
	ll.add("chetan");
	ll.set(1, "chester");
	
	System.out.println(ll);
	
	ArrayList al=new ArrayList();
	al.add("s");
	al.set(0, "s");
	System.out.println(al);
 }
}
