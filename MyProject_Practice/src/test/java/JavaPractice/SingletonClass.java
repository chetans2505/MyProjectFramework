package JavaPractice;

public class SingletonClass {
	private static SingletonClass object;
	private SingletonClass ()
	{
	}
	public static SingletonClass getInstance()
	{
		if (object == null)
		{
			//System.out.println("getInstance(): First time getInstance was called and object created !");
			object = new SingletonClass ();
		}
		return object;
	}
}



