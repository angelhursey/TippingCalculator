import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Restaurant waitress 15-20%
//Bartender $2-$1/drink or 15-20%
//Food Delivery <$20 $3 or >$20 10-15% but no <$5
//Buffet $1/guest or 5-10%
//Uber/Lyft driver 15-20%
		
		//Ask about service type, receive input		
		System.out.println("What type of service did you receive?");
		System.out.println("\n*************************************************");
		System.out.println("Type 'Waiter' for a sit down restaurant service");
		System.out.println("Type 'Bar' for a bar/bartender service");
		System.out.println("Type 'Delivery' for food delivery service");
		System.out.println("Type 'Buffet' for a self serve restaurant service");
		System.out.println("Type 'Ride' for a(n) Uber of Lyft service");
		System.out.println("*************************************************");
		Scanner input = new Scanner(System.in);
		String service = input.nextLine();
		
		//Rating of service		
		System.out.println("How would you rate your service?");
		System.out.println("\n*************************************************");
		System.out.println("Type 'Great' for excellent service \nType 'Average' for average service \nType 'Poor' for bad service");
		System.out.println("*************************************************");
		Scanner inpt = new Scanner(System.in);
		String rate = inpt.nextLine();
		
		//user input total bill amount		
		System.out.println("Please enter your TOTAL bill in the following format: 00.00");
		Scanner userinpt = new Scanner(System.in);
		double bill = userinpt.nextDouble();
		
		//displays suggested tip in two decimal places
		DecimalFormat df = new DecimalFormat("#.00");
		double greatTip = 0;
		double avgTip = 0;
		double poorTip = 0;
		int drinkTip = 0;
		int guestTip = 0;
		
		if (service.equals("Waiter") || service.equals("waiter")) {
			
			if (rate.equals("Great") || rate.equals("great")) {
				greatTip = bill * .20;
				System.out.println("Suggested tip amount: $" + df.format(greatTip));
			}
			else if (rate.equals("Average") || rate.equals("average")) {
				avgTip = bill * .18;
				System.out.println("Suggested tip amount: $" + df.format(avgTip));
			}
			else if (rate.equals("Poor") || rate.equals("poor")) {
				poorTip = bill * .15;
				System.out.println("Suggested tip amount: $" + df.format(poorTip));
			}
			else {
				System.out.println("Please enter a valid rating (Great, Average, Poor):");
			}
		}
		else if (service.equals("Bar") || service.equals("bar")) {
			
			if (rate.equals("Great") || rate.equals("great")) {
				greatTip = bill * .20;
				
				//Tips a minimum of $1				
				if(greatTip < 1) {
					greatTip = 1;
				}
				//suggested tip based off # of drinks				
				System.out.println("How many drinks were served?");
				Scanner usinpt = new Scanner(System.in);
				int drinks = usinpt.nextInt();
				drinkTip = drinks * 2;
				
				System.out.println("Suggested tip amount: $" + df.format(greatTip) + " for the entire bill or $" + df.format(drinkTip) + " for thr drinks");
				usinpt.close();
			}
			else if (rate.equals("Average") || rate.equals("average")) {
				avgTip = bill * .18;
				
				//Tips a minimum of $1				
				if(avgTip < 1) {
					avgTip = 1;
				}
				//suggested tip based off # of drinks				
				System.out.println("How many drinks were served?");
				Scanner usinpt = new Scanner(System.in);
				int drinks = usinpt.nextInt();
				drinkTip = drinks * 1;
				System.out.println("Suggested tip amount: $" + df.format(avgTip) + " for the entire bill or $" + df.format(drinkTip) + " for the drinks");
				usinpt.close();
			}
			else if (rate.equals("Poor") || rate.equals("poor")) {
				poorTip = bill * .18;
				
				//Tips a minimum of $1				
				if(poorTip < 1) {
					poorTip = 1;
				}
				//suggested tip based off # of drinks				
				System.out.println("How many drinks were served?");
				Scanner usinpt = new Scanner(System.in);
				int drinks = usinpt.nextInt();
				drinkTip = drinks * 1;
				System.out.println("Suggested tip amount: $" + df.format(poorTip) + " for the entire bill or $" + df.format(drinkTip) + " for the number of drinks");
				usinpt.close();
			}
			else {
				System.out.println("Please enter a valid rating (Great, Average, Poor):");
			}
		}
		else if (service.equals("Delivery") || service.equals("delivery")) {
			
			if (rate.equals("Great") || rate.equals("great")) {
				if (bill > 20) {
					greatTip = bill * .15;
				}
				//Tips a minimum $3 if bill < $20
				if (bill < 20) {
					greatTip = 3;
				}
				System.out.println("Suggested tip amount: $" + df.format(greatTip));
			}
			else if (rate.equals("Average") || rate.equals("average")) {
				if (bill > 20) {
					avgTip = bill * .12;
				}
				//Tips a minimum $3 if bill < $20
				if (bill < 20) {
					avgTip = 3;
				}
				System.out.println("Suggested tip amount: $" + df.format(avgTip));
			}
			else if (rate.equals("Poor") || rate.equals("poor")) {
				if (bill > 20) {
					poorTip = bill * .10;
				}
				//Tips a minimum $3 if bill < $20
				if (bill < 20) {
					poorTip = 3;
				}
				System.out.println("Suggested tip amount: $" + df.format(poorTip));
			}
			else {
				System.out.println("Please enter a valid rating (Great, Average, Poor):");
			}
		}
		else if (service.equals("Buffet") || service.equals("buffet")) {
			
			if (rate.equals("Great") || rate.equals("great")) {
				greatTip = bill * .10;
				
				//Tips a minimum of $1				
				if(greatTip < 1) {
					greatTip = 1;
				}
				//suggested tip based off # of guest				
				System.out.println("How many guest were served at your table?");
				Scanner userinput = new Scanner(System.in);
				int guest = userinput.nextInt();
				guestTip = guest * 2;
				System.out.println("Suggested tip amount: $" + df.format(greatTip) + " for the entire bill or $" + df.format(guestTip) + " for the number of guest");
				userinput.close();
			}
			else if (rate.equals("Average") || rate.equals("average")) {
				avgTip = bill * .8;
				
				//Tips a minimum of $1				
				if(avgTip < 1) {
					avgTip = 1;
				}
				//suggested tip based off # of guest				
				System.out.println("How many guest were served at your table?");
				Scanner userinput = new Scanner(System.in);
				int guest = userinput.nextInt();
				guestTip = guest * 1;
				System.out.println("Suggested tip amount: $" + df.format(avgTip) + " for the entire bill or $" + df.format(drinkTip) + " for the number of guest");
				userinput.close();
			}
			else if (rate.equals("Poor") || rate.equals("poor")) {
				poorTip = bill * .10;
				
				//Tips a minimum of $1				
				if(poorTip < 1) {
					poorTip = 1;
				}
				//suggested tip based off # of guest				
				System.out.println("How many guest were served at your table?");
				Scanner userinput = new Scanner(System.in);
				int guest = userinput.nextInt();
				guestTip = guest * 1;
				System.out.println("Suggested tip amount: $" + df.format(poorTip) + " for the entire bill or $" + df.format(drinkTip) + " for the number of guest");
				userinput.close();
			}
			else {
				System.out.println("Please enter a valid rating (Great, Average, Poor):");
			}
		}
		else if (service.equals("Ride") || service.equals("ride")) {
			
			if (rate.equals("Great") || rate.equals("great")) {
				greatTip = bill * .20;
				System.out.println("Suggested tip amount: $" + df.format(greatTip));
			}
			else if (rate.equals("Average") || rate.equals("average")) {
				avgTip = bill * .18;
				System.out.println("Suggested tip amount: $" + df.format(avgTip));
			}
			else if (rate.equals("Poor") || rate.equals("poor")) {
				poorTip = bill * .15;
				System.out.println("Suggested tip amount: $" + df.format(poorTip));
			}
			else {
				System.out.println("Please enter a valid rating (Great, Average, Poor):");
			}
		}
		else {
			System.out.println("Please enter a valid service (Waiter, Bar, Delivery, Buffet, Ride):");
		}
		input.close();
		inpt.close();
		userinpt.close();
	}

}
