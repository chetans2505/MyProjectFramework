package JavaPractice;
import JavaPractice.SingletonClass;


public class ClassA {
		public static void main(String[] args) {
			SingletonClass s=SingletonClass.getInstance();
			System.out.println(s);
	}
}
