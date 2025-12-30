package Inheritance;

public class SecurityApp {

	public static void main(String[] args) {
	Army a=	new Army();
	Navy n=	new Navy();
	AirForce ai=new AirForce();
	System.out.println("<<<<<<<<<<<<Army>>>>>>>>>>");
	a.job();
	a.protect();
	a.useTank();
	System.out.println("<<<<<<<<<<<<Navy>>>>>>>>>>");
	n.job();
	n.protect();
	n.useShips();
	System.out.println("<<<<<<<<<<<<Airforce>>>>>>>>>>");
	ai.job();
	ai.protect();
	ai.useJets();	

	}

}
