package io.klib.trafficlights;

public class StartState implements CrossingState {

	@Override
	public void next(Crossing crossing) {
		crossing.setState(new MainGreenState(crossing));
		
	}
	
	public StartState(Crossing crossing) {
		crossing.main.goRed();
		crossing.side.goRed();
		crossing.stateCheck = "Start";
	}

	@Override
	public void printStatus() {
		System.out.println("Both roads currently have Red Lights. This is the starting state.");
		
	}

}
