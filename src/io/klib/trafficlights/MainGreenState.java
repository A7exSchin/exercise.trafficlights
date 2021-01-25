package io.klib.trafficlights;

public class MainGreenState implements CrossingState {

	@Override
	public void next(Crossing crossing) {
		crossing.setState(new SideGreenState(crossing));
		
	}
	
	public MainGreenState(Crossing crossing) {
		if(crossing.stateCheck == "Start") {
			crossing.main.goGreen();
		} else {
			crossing.side.goRed();
			crossing.main.goGreen();
		}
		
		crossing.stateCheck = "MainGreen";
	}

	@Override
	public void printStatus() {
		System.out.println("The Main Road currently has Green Lights.");
		
	}

}
