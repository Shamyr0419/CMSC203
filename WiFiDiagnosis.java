import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		System.out.println("If your internet connectivity poses an issue,"
				+ " This WiFi Diagnosis might work.");
		Scanner input = new Scanner(System.in);
		
		System.out.println("First Step: Reboot your computer. ");
		System.out.println("Are you able to connect to the internet? (yes or no)");
		String response1 = input.nextLine();
		
		switch(response1) {
		case "yes":
			System.out.println("Rebooting your computer seemed to have worked.");
			System.exit(0);
			break;
		case "no":
			System.out.println("Second Step: Reboot your router. ");
			System.out.println("Are you able to connect to the internet now? (yes or no) ");
			break;
		default:
			System.out.println("Invalid input.");
			System.exit(0);
		}
		String response2 = input.nextLine();
		
		switch (response2) {
		case "yes":
			System.out.println("Rebooting your router seemed to have worked.");
			System.exit(0);
			break;
		case "no":
			System.out.println("Third Step: Make sure the cables connecting to your router are plugged in firmly "
					+ "and your router is getting power. ");
			System.out.println("Are you able to connect to the internet now? (yes or no) ");
			break;
		default:
			System.out.println("Invalid input.");
			System.exit(0);
		}
		String response3 = input.nextLine();
		
		switch(response3) {
	case "yes":
		System.out.println("Checking your cables seemed to have worked.");
		System.exit(0);
		break;
	case "no":
		System.out.println("Fourth Step: move your computer closer to your router. ");
		System.out.println("Are you able to connect to the internet now? (yes or no) ");
		break;
	default:
		System.out.println("Invalid input. ");
		System.exit(0);
		}
		String response4 = input.nextLine();
		
		switch(response4) {
		case "yes":
			System.out.println("Moving your computer seemed to have worked.");
			System.exit(0);
			break;
		case "no":
			System.out.println("Fifth Step: contact your ISP. ");
			System.out.println("Make sure your ISP is hooked up to your router.");
			break;
		default:
			System.out.println("Invalid input. ");
			System.exit(0);
			}
	}

}
