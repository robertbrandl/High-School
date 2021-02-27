//Robert Brandl
//ACSL Contest #1
import java.util.Scanner;
import java.util.*;
public class NumberTransformationDriver
{
	public static void main (String [] args)
	{
		int times = 0;
		while (times < 5)
		{
			NumberTransformation transform = new NumberTransformation();
			Scanner scan = new Scanner (System.in);
			System.out.println ("Input a positive integer");
			Long num1 = scan.nextLong();
			transform.getNum (num1);
			ArrayList<Long> digits = new ArrayList<Long>();
			while (num1>0)
			{
				digits.add(0, num1 % 10);
				num1=num1/10;
			}
			System.out.println ("Input a valid position in the prior integer");
			int position1 = scan.nextInt();
			int pos1 = digits.size() - position1;
			ArrayList transformedNum1 = transform.transform (digits,pos1);
			System.out.print ("The transformed number is ");
			int count = 0;
			while (count < transformedNum1.size())
			{
				System.out.print (transformedNum1.get(count));
				count++;
			}
			System.out.println();
			times++;
		}

	}
}