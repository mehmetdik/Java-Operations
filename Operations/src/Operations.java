import java.util.Random;


public class Operations 
{
	public enum CoinState{HEADS,TAILS};

	public static boolean isMultiple(int num1,int num2)
	{
		return num1%num2==0;

	}

	public static double Hypotenuse(double side1,double side2)
	{
		double hipotenüs = 0;
		if (side1<0 || side2<0)
		{
			System.out.printf("Geçersiz işlem");
		}
		else

			hipotenüs=Math.sqrt(side1*side1+side2*side2);

		return hipotenüs;

	}
	public static void squareOfAsterisks(int num)
	{
		for (int j = 0; j < num; j++) {


			for (int i = 0; i < num; i++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static double ReversingDigits(double sayi3)
	{
		
		double ters=0;
		
		
		while (sayi3>0)
		{
			ters=ters*10+(sayi3%10);
			sayi3=sayi3/10;
		}
		

		return ters;
	}
	public static CoinState flip()
	{
		Random r=new Random();
		if (r.nextInt(2)==0) 
		{
			return CoinState.HEADS;
		}
		else
		{
		return CoinState.TAILS;	
		}
	}
	
	
	

}
