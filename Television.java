/**
 * The purpose of this class is to model a television
 * Runyararo Mucheche 04/27/2023
 * @author runya
 *
 */
public class Television {

	private final String MANUFACTURER;		// Represents the manufacturer of the TV
	private final int SCREEN_SIZE;			// Represents the TV size
	private boolean powerOn;				// Represents whether the TV is on or not
	private int channel;					// Represents the channel on the TV
	private int volume;						// Represents the volume of the TV
	
	/**
	 * Initializes a TV object and set
	 * @param brand The name of the TV manufacturer
	 * @param size The size of the TV screen
	 */
	public Television(String brand, int size) {
		MANUFACTURER = brand;		// Assigns brand to the MANUFACTURER field
		SCREEN_SIZE = size;			// Assigns the size to the SCREEN_SIZE field
		powerOn = false;			// Initializes the powerOn field to false
		volume = 20;				// Sets the volume to 20
		channel = 2;				// Sets the channel to 2
	}
	
	/**
	 * getVolume method
	 * @return The value in the volume field
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * getChannel method
	 * @return The value in the channel field
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * getManufacturer method
	 * @return The value of MANUFACTURER field
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * getScreenSize method
	 * @return The value of the SCREEN_SIZE field
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	/**
	 * Takes a value and assigns it to the channel field
	 * @param channel Value to assign.
	 */
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	/**
	 * Reassigns the value of powerOn depending on whether it's true or false
	 */
	public void power() {
		if (powerOn) {
			powerOn = !powerOn;
		} else {
			powerOn = !powerOn;
		}
	}
	
	/**
	 * Increase the value of volume by 1
	 */
	public void increaseVolume() {
		volume++;
	}
	
	/**
	 * Decrease the value of volume by 1
	 */
	public void decreaseVolume() {
		volume--;
	}
	
}
