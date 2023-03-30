public class Demo
{
	public Demo()
	{
		System.out.println("Non Parametrized Constructor");
	}
	public Demo(String str)
	{
		System.out.println(str);
	}
	public static void demo()
	{
		System.out.println("demo method of class Demo");
	}
	public static void main(String args[])
	{
		Demo d = new Demo();
		Demo d1 = new Demo("Demo Constructor with String Parameter");
		d.demo();
	}

}
