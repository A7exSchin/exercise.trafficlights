package io.klib.trafficlights;

public class TrafficLight {
	
	String trafficLightState;
	String position;
	
	
	public TrafficLight(String position) {
		this.position = position;
		this.setStop();
	}
	
	public void goGreen() {
		this.setGetReady();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setGo();
	}
	
	public void goRed() {
		this.setBeAware();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setStop();
	}
	
	//Defining the four different states
	private void setStop() {
		trafficLightState = "Stop";
		System.out.println(position + " set to 'Stop'! Red");
	}
	
	private void setGo() {
		trafficLightState = "Go";
		System.out.println(position + " set to 'Go'! Green");
	}
	
	private void setBeAware() {
		trafficLightState = "BeAware";
		System.out.println(position + " set to 'Be Aware'! Yellow");
	}
	
	private void setGetReady() {
		trafficLightState = "GetReady";
		System.out.println(position + " set to 'Get ready'! Red-Yellow");
	}
	
	
}
