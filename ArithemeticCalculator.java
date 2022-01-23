
import java.util.Scanner;

public class ArithemeticCalculator
{
 public static void main(String[] args) {
	
	 
	 char operator;
	 int num1;
	 int num2;
	 int result;
	 
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("choose an operator : +,-,*,/,%");
	 operator=s.next().charAt(0);
	 
	 System.out.println("enter the first number");
	 num1=s.nextInt();
	 
	 System.out.println("enter the second number");
	 num2=s. nextInt();
	 
	 switch(operator)
	 {
	 case '+':
		 result=num1+num2;
		 System.out.println(result);
		 break;
		 
	 case '-':
		 result=num1-num2;
		 System.out.println(result);
		 break;
		 
	 case '*':
	      result=num1*num2;
	 System.out.println(result);
	 break;
	 
	 case '/':
		 result=num1/num2;
		 System.out.println(result);
		 break;
		 
	 case '%':
		 result=num1%num2;
		 System.out.println(result);
		 break;
		 
		 default :
			 System.out.println("invalid operation");
	 }
	 
}
}
