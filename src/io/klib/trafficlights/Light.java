package io.klib.trafficlights;

public class Light {
	String colour;
	String state;
	public Light (String colour, String state) {
		 this.colour = colour;
		 this.state = state;
	}
	
	public void turnOn() {
		state = "On";
	}
	
	public void turnOff() {
		state = "Off";
	}
 }
