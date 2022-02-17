package Generalization;

public class gen1 {

	public static void main(String[] args) {

		System.out.println("......airtel simcard properties....... ");
		airtel a = new airtel();
		a.airtelextreme();
		a.audiocalling();
		a.internet();
		a.msg();

		System.out.println(".......jio simcard properties........");

		jio j = new jio();
		j.amazonprime();
		j.audiocalling();
		j.internet();
		j.msg();

		System.out.println("..............idea simcard properties.........");

		idea i = new idea();
		i.audiocalling();
		i.internet();
		i.msg();
		i.netflix();

	}

}
