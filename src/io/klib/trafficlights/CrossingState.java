package io.klib.trafficlights;

public interface CrossingState {
	
	void next(Crossing crossing);
	void printStatus();
	
}
