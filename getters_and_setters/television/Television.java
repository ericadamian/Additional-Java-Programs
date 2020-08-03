// java program by Eric Adamian
// setters and getters for variables for main method

import java.util.Scanner;

public class Television{

	private final String manufacturer;
	private final int screenSize;
	private boolean powerOn;
	private int channel, volume;

	// constructor
	public Television(String brandName, int tvSize){
		manufacturer = brandName;
		screenSize = tvSize;
		powerOn = false;
		volume = 20;
		channel = 2;
	}

	// setters and getters
	public int getChannel(){
		return channel;
	}

	public int getVolume(){
		return volume;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public int getScreenSize(){
		return screenSize;
	}

	public void setChannel(int channel1){
		channel = channel1;
	}

	public void power(){
		powerOn = !powerOn;
	}

	public void increaseVolume(){
		volume += 1;
	}

	public void decreaseVolume(){
		volume -= 1;
	}
}