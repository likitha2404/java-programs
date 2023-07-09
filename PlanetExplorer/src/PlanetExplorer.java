import java.util.*;
public class PlanetExplorer {

	public static void main(String[] args) {
		//(4*(22/7)*r)*(4*(22/7)*r)
		Scanner scan=new Scanner(System.in);
		double radius=scan.nextDouble();
		//double radius;
		double a=calculateSurfaceArea(radius);
		{
		System.out.println("area ="+ a);
		}	
	}
	public static double calculateSurfaceArea(double radius)
	{
	return (4*3.14*(radius*radius));
}
}