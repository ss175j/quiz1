import java.util.Scanner;

public class quiz1 {
   public static void main(String[] args){
	   Scanner s = new Scanner(System.in);
	   
	   System.out.println("Enter TD");
	   double TD = s.nextDouble();
	   System.out.println("Enter ATT");
	   double ATT = s.nextDouble();
	   System.out.println("Enter COMP");
	   double COMP = s.nextDouble();
	   System.out.println("Enter Yards");
	   double Yards = s.nextDouble();
	   System.out.println("Enter INT");
	   double INT = s.nextDouble();
	   double a,b,c,d;
	   double QB;
	   a=(COMP/ATT-0.3)*5;
	   b=(Yards/ATT-3)*0.25;
	   c=(TD/ATT)*20;
	   d=2.375-((INT/ATT)*25);
	   QB=((a+b+c+d)/6)*100;
	   
	   if (QB<=158.3 && QB>0){
		   System.out.printf("The QB is %4.1f", QB);
	   }
	   else{
		   System.out.println("The QB is 0");
	   }
   }
}
