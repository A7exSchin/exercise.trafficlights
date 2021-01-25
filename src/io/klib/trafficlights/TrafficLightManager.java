package io.klib.trafficlights;

import java.io.IOException;

public class TrafficLightManager {
	
	private static final TrafficLightManager manager = new TrafficLightManager();
	
	private TrafficLightManager() {
		System.out.println("Neue Kreuzung erstellt!");
	}
	
	public static TrafficLightManager getInstance() {
		return manager;
	}

	public void run() {
		
		System.out.println("Press Enter to start the Traffic!");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Crossing mainCrossing = new Crossing();
		while(true) {
			mainCrossing.nextState();
		}
			
			
		}
	}
	
