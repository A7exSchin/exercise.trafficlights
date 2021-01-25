package io.klib.trafficlights;

public class Crossing {
	
	TrafficLight main = new TrafficLight("Main");
	TrafficLight side = new TrafficLight("Side");
	String stateCheck;
	
	private CrossingState state = new StartState(this);
	
	
	public void nextState() {
		state.next(this);
	}
	
	void setState(CrossingState state) {
		this.state = state;
	}
	
	public CrossingState getState() {
		return state;
		
	}
	
}
