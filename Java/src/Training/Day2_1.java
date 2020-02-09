package Training;

public class Day2_1 {   ////  (((((10-2)+2)*2)-2)/2)
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int sub(int x, int y)
	{
		int z = x-y;
		return z;
	}
	public int mul(int a, int b)
	{
		int c = a*b;
		return c;
	}
	public int div(int p, int q)
	{
		int r = p/q;
		return r;
	}
	public static void main(String[] args) ////  (((((10-2)+2)*2)-2)/2)
	{
		Day2_1 obj = new Day2_1();

		int subt = obj.sub(10,2);
		int add = obj.add(subt, 2);
		int mult = obj.mul(add, 2);
		int subt1 = obj.sub(mult, 2);
		int div = obj.div(subt1, 2);

		System.out.println("The Final result is: "+div);
	}
}