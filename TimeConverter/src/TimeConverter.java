import java.util.Scanner;
public class TimeConverter{
public static void main(String[] args) {

Scanner scan=new Scanner(System.in);

System.out.println("Enter temp in F");

int minutes=scan.nextInt();

TimeConverter timeConverter=new TimeConverter();

System.out.println(convertToHours(minutes));

}

public static double convertToHours(int minutes)

{

return minutes/60;

}

}

