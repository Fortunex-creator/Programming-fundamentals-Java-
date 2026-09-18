import java.util.Scanner;
import java.text.DecimalFormat;

public class BookStorePurchase
{
	public static void main(String[] args)
	{
		//create objects 
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R#.00");
		
		//CONSTANT 
		final double newBook = 400;
		final double usedBook = 280;
		final double eBook = 200;
		final double rentBook = 150;
		
		//variables
		String sStudId;
		String terminator = "-1";
		char option;
		int iNumBooks;
		double iTotal = 0;
		int iCounter1 = 0;
		int iCounter2 = 0;
		int iCounter3 = 0;
		int iCounter4 = 0;
		
		
		
		//PROMPT USER 
		
		System.out.print("Welcome to first- year Student's Bookstore Purchase Application!");
		
		
		System.out.print("\n\nEnter student ID number ( type -1 to terminate)");
		sStudId = kb.nextLine();
		
		while(!(sStudId == terminator))
		{
			System.out.print("\nPlease select a purchase option:");
			System.out.print("\nN/n - Buy New Book (R400,00)");
			System.out.print("\nU/u - Buy Used Book (R280.00");
			System.out.print("\nR/r - Rent Book (Per Semester) (R150.00)");
			System.out.print("\nE/e - E-Book (R200.00)");
			System.out.print("\nOption: ");
			option = kb.next().charAt(0);
			option = Character.toUpperCase(option);
			
			System.out.println("How many Books?:");
			iNumBooks = kb.nextInt();
			
			System.out.print("Invoice for Student ID: " + sStudId);
			System.out.println("\nPurchase Option : " + iNumBooks + " New Books(s)");
			
			if(option == 'N')
			{
				iCounter1++;
				iTotal = newBook * iNumBooks;
				
			}else if(option == 'U')
			{
				iCounter2++;
				iTotal = usedBook * iNumBooks;
					
			}else if(option == 'R')	
			{
				iCounter3++;
				iTotal = rentBook * iNumBooks;
					   
			}else if(option == 'E')
			{
				iCounter4++;
				iTotal = eBook * iNumBooks;
			} else
			{
				System.out.println(option + " is invalid. Please enter either N, U, R or E.");
			}
				System.out.print("\nyour toatl is: " + df.format (iTotal)); 		
			
		}
	}
}