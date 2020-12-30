package io.klib.trafficlights;

public class Crossing {
	//two streets, main and side. Main goes in north/south direction, Side goes in west/east direction.
	//sidelanes have switches, that
	boolean sideStreetPressurePlate;
	int mainGreenDuration = 10; // = sideRedDuration
	int mainRedDuration = 5; // = sideGreenDuration
	TrafficLight mainNorth = new TrafficLight();
	TrafficLight mainSouth = new TrafficLight();
	TrafficLight sideWest = new TrafficLight();
	TrafficLight sideEast = new TrafficLight();

	public  void main(String[] args) throws InterruptedException {
		//default state
		mainNorth.setGo();
		mainSouth.setGo();
		sideWest.setStop();
		sideEast.setStop();
		
		while(true) {
			if (sideStreetPressurePlate) {
				mainNorth.cycleState();
				mainSouth.cycleState();
				sideWest.cycleState();
				sideEast.cycleState();
			}
		}
	}
	
}
