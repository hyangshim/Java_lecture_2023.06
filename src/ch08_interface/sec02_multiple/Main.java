package ch08_interface.sec02_multiple;

import ch08_interface.sec01.RemoteControllable;

public class Main {
	public static void main(String[] args) {
		RemoteControllable rc =new SmartTV();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		
		System.out.println("--------------------");
		Searchable sc =new SmartTV();
		sc.search("YouTube");
		
		System.out.println("--------------------");
		SmartTV stv =new SmartTV();
		stv.turnOff();
		stv.search("Naver");
		stv.setVolume(7);
		stv.turnOff();
	}

}
