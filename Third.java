
public class Third 
{
public static void main(String[] args) 

{
	int a[]= {2,5,1,5,4};
	int count=0;
	for(int i=a.length-1;i>=0;i--)
	{
		if(a[i]!=i+1)
		{
			if(a[i-1]==i+1)
			{
				count=count+1;
				int temp=0;
				temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
			}
			else if(a[i-2]==i+1)
			{
				int temp=0;
				temp=a[i-1];
				a[i-1]=a[i-2];
				a[i-2]=temp;
				
				int temp1=0;
				temp1=a[i];
			    a[i]=a[i-1];
				a[i-1]=temp1;
				
				count=count+2;
			}
			else
			{
				System.out.println("toCathotic");
				System.exit(0);
			}
		}
	}
	System.out.println(count);
}
}
	

	
	
	