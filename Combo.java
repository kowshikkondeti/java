class Combo{
	public static void main(String arg[]){
	int a=0,b=0,c=0;
	for(a=1;a<=3;a++)
	{
		for(b=1;b<=3;b++)
		{
			for(c=1;c<=3;c++)
			{
				if(a!=b && b!=c && c!=a)
				{
					System.out.println(a+""+b+""+c);
				}
			}
		}
	}
}
}
