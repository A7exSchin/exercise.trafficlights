package io.klib.trafficlights;

public class TrafficLight {
	
	String state;
	
	// Different Lights
	Light topLight = new Light("Red", "Off");
	Light midLight = new Light("Yellow", "Off");
	Light botLight = new Light("Green", "Off");
	
	public TrafficLight() {
	}
	
	//Defining the four different states
	public void setStop() {
		topLight.turnOn();
		midLight.turnOff();
		botLight.turnOff();
		state = "Stop";
	}
	
	public void setGo() {
		topLight.turnOff();
		midLight.turnOff();
		botLight.turnOn();
		state = "Go";
	}
	
	public void setBeAware() {
		topLight.turnOff();
		midLight.turnOn();
		botLight.turnOff();
		state = "Be Aware";
	}
	
	public void setGetReady() {
		topLight.turnOn();
		midLight.turnOn();
		botLight.turnOff();
		state = "Get ready";
	}
	
	public void cycleState() throws InterruptedException {
		if (state == "Stop") {
			this.setGetReady();
			Thread.sleep(1000);
			this.setGo();
		} else if (state == "Go") {
			this.setBeAware();
			Thread.sleep(1000);
			this.setStop();
		}
	}
	
}
