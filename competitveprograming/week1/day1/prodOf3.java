public class prodOf3
{
	public static int h1 = Integer.MIN_VALUE;
	public static int h2 = Integer.MIN_VALUE;
	public static int h3 = Integer.MIN_VALUE;
	public static int l2 = Integer.MAX_VALUE;
	public static int l3 = Integer.MAX_VALUE;
	public static void main(String[] args) 
	{
		// System.out.println(l3);
		int[] a = new int[]{5,5,5,5,5,5};
		// int swap=0;
		for(int i=0; i<a.length; i++)
		{
			// System.out.println("i: "+i+"-- h1:"+h1+" h2:"+h2+" h3:"+h3);
			// System.out.println("l1:"+l3+" l2:"+l2);
			if(h1<a[i])
			{
				h3=h2;
				h2=h1;
				h1=a[i];
			}
			else if (h2<a[i])
			{
				h3=h2;
				h2=a[i];	
			}
			else if(h3<a[i])
			{
				h3=a[i];
			}
			if(l3>a[i])
			{
				l2=l3;
				l3=a[i];
			}
			else if(l2>a[i])
			{
				l2=a[i];
			}
		}
		
		int p1=h1*h2*h3;
		int p2=l2*l3*h1;
		if(p1>p2)
		{
			System.out.println(p1);
		}
		else
		{
			System.out.println(p2);
		}
	}
}