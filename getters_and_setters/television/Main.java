// java program by Eric Adamian
// manipulating 2 television channels/volumes based on user input

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		// scanner	
		Scanner input = new Scanner (System.in);

		// declare and instantiate 2 television objects
		Television toshiba = new Television("Toshiba", 55);
		Television sharp = new Television("Sharp", 19);

		// turn the power on
		toshiba.power();

		// display the state of the television and asks for user input
		System.out.println("A " + toshiba.getScreenSize() + " inch " + toshiba.getManufacturer() + " has been turned on.");
		System.out.print("What channel do you want? "); 
		int station = input.nextInt();

		// change channel and increase volume on the television 
		toshiba.setChannel(station);
		toshiba.increaseVolume();

		// display the the current channel/volume of the television
		System.out.println("Channel: " + toshiba.getChannel() + " Volume: " + toshiba.getVolume());
		System.out.println("Too loud! Lowering the volume by 6.");

		// decrease the volume of the television
		toshiba.decreaseVolume(); 
		toshiba.decreaseVolume();
		toshiba.decreaseVolume();
		toshiba.decreaseVolume();
		toshiba.decreaseVolume();
		toshiba.decreaseVolume();

		// display the the current channel and volume of the television 
		System.out.println("Channel: " + toshiba.getChannel() + " Volume: " + toshiba.getVolume());
		System.out.println();

		// using a power method on the television object
		sharp.power();

		// display the state of the television and asks for user input
		System.out.println("A " + sharp.getScreenSize() + " inch " + sharp.getManufacturer() + " TV has been turned on.");
		System.out.print("What channel do you want? ");
		station = input.nextInt();

		// decreasing the volume by two from volume = 20
		sharp.decreaseVolume();
		sharp.decreaseVolume();

		// display the the current channel and volume of the television 
		System.out.println("Channel: " + station + " Volume: " + sharp.getVolume());
	}
}