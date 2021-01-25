package io.klib.trafficlights;

public class SideGreenState implements CrossingState {

	@Override
	public void next(Crossing crossing) {
		crossing.setState(new MainGreenState(crossing));
		
	}
	
	public SideGreenState(Crossing crossing) {
		crossing.main.goRed();
		crossing.main.goGreen();
		crossing.stateCheck = "SideGreen";
	}


	@Override
	public void printStatus() {
		System.out.println("The Side Road currently has Green Lights!");
		
	}

}
