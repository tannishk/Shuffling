public class shuffle_quad {
	public static void shuffle(int[] a)
	{
		int N=a.length;
		double [] k;
		k= new double[N];
		for(int i=0;i<N;i++)
		{
			k[i]=Math.random();
		}
		for(int i=0;i<N;i++)
		{
			
			for(int j=i;j>0;j--)
			{
				if(k[j-1]>k[j])
				{
					double temp=k[j-1];
					k[j-1]=k[j];
					k[j]=temp;
					int temp1=a[j-1];
					a[j-1]=a[j];
					a[j]=temp1;
				}
				else
				{
					break;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		shuffle(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
