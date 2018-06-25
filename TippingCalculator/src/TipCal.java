import java.util.Scanner;

public class TipCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Restaurant waitress 15-20%
//Bartender $1/drink or 15-20%
//Food Delivery <$20 $3 or >$20 10-15% but no <$5
//Buffet $1/guest or 5-10%
//Uber/Lyft driver 15-20%
		
		System.out.println("What type of service did you receive?");
		System.out.println("Type 'Waiter' for a sit down restaurant service");
		System.out.println("Type 'Bar' for a bar/bartender service");
		System.out.println("Type 'Delivery' for food delivery service");
		System.out.println("Type 'Buffet' for a self serve restaurant service");
		System.out.println("Type 'Ride' for a(n) Uber of Lyft service");
		
		Scanner input = new Scanner(System.in);
		String service = input.nextLine();
	}

}
