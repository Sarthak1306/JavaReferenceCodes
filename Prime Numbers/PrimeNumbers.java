import java.util.*;

class PrimeNumbers{
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		System.out.println("Prime Numbers between 2 and "+a+" are :");
		for(int i=2;i<=a;++i)
		{
			int counter=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					counter++;
			}
			
			if(counter==2)
			{
				System.out.print(i+" ");
			}
		}

		System.out.println(" ");

	}
}