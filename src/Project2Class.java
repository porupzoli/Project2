import java.lang.invoke.SwitchPoint;
import java.util.Scanner;


public class Project2Class {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		double num1= scanner.nextDouble();
		String operator= scanner.next();
		double num2= scanner.nextDouble();
		System.out.println(Calculator(operator, num1, num2));
	}
	
	public static double calc(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter your calculaciton");
		String calculation= scanner.nextLine();
		
		double firstOperand=Double.parseDouble(calculation.split("")[0]);
		
		
		
	}
	
	public static double Calculator(String operator, double num1, double num2)
	{
		
		double result=0;
	switch(operator){
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			if(num2!=0)
			{
				result=num1/num2;
				break;
			}
			else System.out.println("Error");
		
		}
		return result;
	}
}
