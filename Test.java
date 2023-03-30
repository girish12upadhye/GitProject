public class Test
{
	public Test(String str)
	{
		System.out.println(str);
	}
	public void masterBranch()
	{
		System.out.println("Master Branch");
	}
	public static void main(String args[])
	{
		Test t = new Test("This is Test Class Constructor");
	}
}
