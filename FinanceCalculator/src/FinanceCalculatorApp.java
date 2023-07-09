import java.util.Scanner;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator calculator=new FinanceCalculator();
		//calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);
		//double interest=calculateSimpleInterest(double principal,double rate,double time);
		System.out.println(FinanceCalculator.calculateSimpleInterest(principal,rate,time));

	}

}
