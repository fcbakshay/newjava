package Inheritance;

public class hirarchicleinherance {

	public static void main(String[] args) {
		sonC c1 = new sonC();
		c1.generalstore();
		sonB b1 = new sonB();
		b1.medicalshop();
		sonA a1 = new sonA();
		a1.stationaryshop();
		a1.car();
		a1.bunglow();
		a1.cash();

	}

}
