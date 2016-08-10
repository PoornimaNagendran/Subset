import java.util.Scanner;
public class Subset {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the size of set");
		int n2=s.nextInt();
int[] a2=new int[n2];
System.out.println("Enter the size of subset");
int n1=s.nextInt();
int[] a1=new int[n1];
System.out.println("Enter elements of set");
for(int i=0;i<n2;i++)
{
	a2[i]=s.nextInt();
}
System.out.println("Enter elements of subset");
for(int i=0;i<n1;i++)
{
	a1[i]=s.nextInt();
}
for(int i=0;i<n2;i++)
{
	for(int j=0;j<n1;j++)
	{
		if(a2[i]==a1[j])
		{
		count++;
		break;
		}
	}
}
	if(count==n1)
	{
		System.out.println("a1 is subset of a2");
	}
	else
	{
		System.out.println("a1 is not a subset of a2");
	}
	}

}
