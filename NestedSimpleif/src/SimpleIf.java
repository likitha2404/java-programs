public class SimpleIf{
public static void main(String[] args){
int a=10;
int b=-5;

{
if(a>0)
System.out.println("positive");
{
	if(b>0)
		System.out.println("positive");
	{
		if(a<0)
			System.out.println("negative");
		{
			if(b<0)
				System.out.println("negative");
		}
	}
}
}

}
}

//yes nested simple if is possible