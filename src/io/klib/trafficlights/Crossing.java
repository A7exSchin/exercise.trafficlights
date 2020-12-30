package io.klib.trafficlights;

public class Crossing {
	//two streets, main and side. Main goes in north/south direction, Side goes in west/east direction.
	//sidelanes have switches, that 
	int mainGreenDuration = 10;
	int mainRedDuration = 5;
	TrafficLight mainNorth = new TrafficLight();
	TrafficLight mainSouth = new TrafficLight();
	TrafficLight sideWest = new TrafficLight();
	TrafficLight sideEast = new TrafficLight();
	
	
	
}
