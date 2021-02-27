
/**
 * The purpose of this class is to model a television
 * @author shamyrdouglas, February 26, 2021
 *
 */
public class Television {

		// constant named manufacturer that holds the brand name
		private String manufacturer;
		//constant named screenSize that holds size of the television screen
		private int screenSize;
		//powerOn holds value true if power is on, false otherwise
		private boolean powerOn;
		//channel holds value of station that is showing
		private int channel = 2;
		//volume holds a number value representing loudness (0 being no sound)
		private int volume = 20;
		
		//constructor below has the power off, and set fields equal to parameters
		public Television(String manu, int scrn) {
			manufacturer = manu;
			screenSize = scrn;
			powerOn = false;
		}
		//getVolume returns the value in variable volume
		public int getVolume() {
			return volume;
		}
		//getChannel returns the value in variable channel
		public int getChannel() {
			return channel;
		}
		//getManufacturer returns the string phrase in variable manufacturer
		public String getManufacturer() {
			return manufacturer;
		}
		//getScreenSize returns value in variable screenSize
		public int getScreenSize() {
			return screenSize;
		}
		//setChannel sets the variable channel to 0, in order to accept values
		public void setChannel(int chan) {
			channel = chan;
		}
		//power sets powerOn to true if power is on, false otherwise
		public void power() {
			if (!powerOn) {
				powerOn = false;
			}
			else {
				powerOn = true;
			}
		}
		//increaseVolume increases the variable volume value by 1
		public void increaseVolume() {
			volume += 1;
		}
		//decreaseVolume decreases the variable volume value by 1
		public void decreaseVolume() {
			volume -= 1;
		}
		
		


}
