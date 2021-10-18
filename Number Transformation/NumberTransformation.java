//Robert Brandl
//ACSL Contest #1
import java.util.*;
public class NumberTransformation
{
	ArrayList<Integer> primeFactors = new ArrayList<Integer>();
	long number;
	public ArrayList transform(ArrayList num,int position)
	{
		replaceLeft(num, position);
		replaceRight(num, position);
		replaceP(num, position);
		return num;
	}
	private void replaceLeft(ArrayList num, int position)
	{
		int x = 0;
		while (x < position)
		{
			long n = (long)num.get(x);
			long y = (long)num.get(position);
			num.remove(x);
			num.add(x, (n + y));
			x++;
		}
	}
	private void replaceP (ArrayList num, int position)
	{
		for (int i = 2; i <= number; i++)
		{
			if(primeFactors.contains(i) == false)
			{
			   while (number % i == 0)
				{
					if(primeFactors.contains(i) == false)
					{
						primeFactors.add(i);
					}
					number /= i;
				}
			}
		}
		num.remove (position);
	    int length = primeFactors.size();
	    num.add (position, length);
	}
	private void replaceRight (ArrayList num, int position)
	{
		int x = num.size() - 1;
		while (x > position)
		{
			long n = (long)num.get(x);
			long y = (long) num.get(position);
			num.remove(x);
			num.add(x, Math.abs(n - y));
			x--;
		}
	}
	public void getNum (long n)
	{
		number = n;
	}
}
