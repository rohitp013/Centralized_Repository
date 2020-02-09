package Training;

public class Day2 {      //   (((((10+2)-2)+2)*2)/2)
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int sub(int x, int y)
	{
		int z = x - y;
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
	public static void main(String[] args) ////  (((((10+2)-2)+2)*2)/2)
	{
		Day2 obj = new Day2();
		int add = obj.add(10, 2);
		int subt = obj.sub(add,2);
		int add1 = obj.add(subt, 2);
		int mult = obj.mul(add1, 2);
		int div = obj.div(mult, 2);
		System.out.println("The Final result is: "+div);
	}
}
