import java.util.Scanner;

public class HackathonApp
{
	public static void main(String[] args)
	{
		//create objects
		Scanner kb = new Scanner(System.in);
		
		//declare variables 										
		String sName;
		char gender;
		int iInstitution = 0;
		String uni = " ";
		int  iTheme;
		String sTheme = " ";
		int iYearLevel;
		String sYearLevel = " ";
		
		
		
		
		
		//input 
		System.out.print("Enter your name and surname: ");
		sName = kb.nextLine();
		
		// request gender input 
		System.out.print("enter your gender(<m><M>/<F><f>: ");
		gender = kb.next().charAt(0);
       
		//convert case
		gender = Character.toLowerCase(gender);
		

        // Step 2: Gender Validation 
        if(!(gender == 'm' || gender == 'f'))
		{
			System.out.println("\nError: invalid gender.Please enter M/m for male or F/f for female.");
		}else 
		{
			System.out.println("Select your institution:\n" + "1. TUT\n"+ "2. Nkangala TVET College\n" + "3. UMP\nEnter choice(1-3)");
			
			iInstitution = kb.nextInt();
		}
			
			if(iInstitution == 1)
			{
				uni = "TUT";
			}
			else if(iInstitution == 2)
			{
				uni = "Nkangala";
			}
			else if(iInstitution == 3)
			{
				uni = "UMP";
			}
			else
				{
					System.out.print("invalid institution option,enter the correct value ");
				}
		//check theme option
				System.out.println("Select your preferred hackathon theme:\n1. AgriTech & Innovation\n 2. AI & Machine Learning\nEnter choice(1-2): ");
				iTheme = kb.nextInt();
				
		if(iTheme == 1 )
		{
			sTheme = "AgriTech & Innovation";
		}
		else if(iTheme == 2)
		{
			sTheme = " AI & Machine Learning";
		}else
		{
			System.out.println("invalid theme choice");
		}	

		//check year level switch 
		System.out.print("Enter your current year level(1-4):");
		iYearLevel = kb.nextInt();
		switch(iYearLevel)
		{
			case 1: 
				sYearLevel = " junior";
			break;
			
			case 2: 
			sYearLevel = "Intermediate ";
			break;
			
			case 3: 
			sYearLevel = "Senior ";
			break;
			
			case 4: 
			sYearLevel = "post graduate ";
			break;
			
			default:
			sYearLevel = "invalid input,choose correctly ";
		}
				
				System.out.println("n\n=== HACKATHON REGISTRATION SUCCESSFUL===");
				System.out.println("Name: " + sName);
				System.out.println("Gender: " + gender);
				System.out.println("Institution: " + uni);
				System.out.println("Hackathon :" + sTheme);
				System.out.println("Year level: " + iYearLevel);
				System.out.println("Year Category: " + sYearLevel);		
			
    }
}