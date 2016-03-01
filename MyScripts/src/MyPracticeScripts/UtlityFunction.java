package MyPracticeScripts;

public class UtlityFunction {

	public static void main(String[] args)
	{
		
	 myRandomNo();

	}
	public static void myRandomNo()
	{
		int c=0;
		while (c<10) 
		{
			double d=Math.random()*100;
			int a=(int)d;
			System.out.println(a);
			c++;
		}
		
	}

}
