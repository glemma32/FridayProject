import java.util.Scanner;

//import javax.swing.JOptionPane;

public class SalesRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int customerId;
		String firstName, lastName,taxCode;
		String choice="";
		double totalAmount,salesAmount;
		
		do
		{
		System.out.println("Enter your ID:");
		Scanner Id= new Scanner(System.in);
		customerId= Id.nextInt();
		
		System.out.println("Enter your full name:");
		Scanner Fname= new Scanner(System.in);
		firstName= Fname.next();
		Scanner Lname= new Scanner(System.in);
		lastName= Lname.next();
				
		System.out.println("Enter the sales amount");
		Scanner Sales= new Scanner(System.in);
		salesAmount= Sales.nextDouble();
		
		System.out.println("Enter your tax code:");
		Scanner tax= new Scanner(System.in);
		taxCode= tax.next();
		
		if(taxCode.equalsIgnoreCase("NRM"))
		{
			totalAmount= salesAmount+(salesAmount*0.06);
			System.out.println("Your tax amount is 6%");
			totalAmount= salesAmount+(salesAmount*0.06);
			System.out.println("Your total amount is: "+ totalAmount);
		}
		else if(taxCode.equalsIgnoreCase("NPF"))
		{
			totalAmount= salesAmount;
			System.out.println("Your have tax exemption");
			System.out.println("Your total amount is only: "+ totalAmount);
		}
		else if(taxCode.equalsIgnoreCase("BIZ"))
		{
			totalAmount= salesAmount+(salesAmount*0.045);
			System.out.println("Your tax amount is 4.5%");
			System.out.println("Your total amount is: "+ totalAmount);
		}
		
		else
		{
			System.out.println("You enter an invalid value");
		}
		
		System.out.println("Do you want to add another record? Y/N");
		Scanner Choose= new Scanner(System.in);
		choice= Choose.next();
		if(!choice.equalsIgnoreCase("N") && !choice.equalsIgnoreCase("Y"))
			System.out.println("You entered an invalid choice");
		}while (choice.equalsIgnoreCase("Y"));
				
	}

}
