import java.util.Scanner;

public class CalculatorProject {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("**************WELCOME TO CALCULATOR APPLICATION******************");
		System.out.println("Enter 1 to perform the ADDITION Operator");
		System.out.println("Enter 2 to perform the SUBTRACTION Operator");
		System.out.println("Enter 3 to perform the MUTIPLICATION Operator");
		System.out.println("Enter 4 to perform the DIVITION(Quotient) Operator");
		System.out.println("Enter 5 to perform the DIVITION(Remainder) Operator");
		int userChoice = sc.nextInt();
		switch(userChoice){
			case 1 :{
				System.out.println("*******You have choose Addition operation*********");
				System.out.println("Enter the first number : ");
				int number1 = sc.nextInt();
				System.out.println("Enter the Second number : ");
				int number2 = sc.nextInt();
				int sum = number1 + number2;
				System.out.println(sum);
			}
			break;
			case 2 :{
				System.out.println("*******You have choose Subtraction operation*********");
				System.out.println("Enter the first number : ");
				int number1 = sc.nextInt();
				System.out.println("Enter the Second number : ");
				int number2 = sc.nextInt();
				int subtraction = number1 + number2;
				System.out.println(subtraction);
			}
			break;
			case 3 :{
				System.out.println("*******You have choose Mutiplication operation*********");
				System.out.println("Enter the first number : ");
				int number1 = sc.nextInt();
				System.out.println("Enter the Second number : ");
				int number2 = sc.nextInt();
				int multiplication = number1 + number2;
				System.out.println(multiplication);
			}
			break;
			case 4 :{
				System.out.println("********* You have choose Divition(Quotient) operation");
				System.out.println("Enter the first number : ");
				int number1 = sc.nextInt();
				System.out.println("Enter the Second number : ");
				int number2 = sc.nextInt();
				int quotient = number1 / number2;
				System.out.println(quotient);
			}
			break;
			case 5 :{
				System.out.println("********* You have choose Divition(Remainder) operation");
				System.out.println("Enter the first number : ");
				int number1 = sc.nextInt();
				System.out.println("Enter the Second number : ");
				int number2 = sc.nextInt();
				int remainder = number1 / number2;
				System.out.println(remainder);
			}
			break;
			default : System.out.println("Invaled..... please check once");
		}
		System.out.println("Thank You");

	}
}
