package com.cc.java;

public class App {

	public static void main(String[] args) {
	Mitarbeiter worker1 = new Mitarbeiter("Müller", "Tim", "Callcenter", 2010 );
	Mitarbeiter worker2 = new Mitarbeiter("Schmitz", "Heiko", "Lieferant", 2005 );
	Mitarbeiter worker3 = new Mitarbeiter("Schubert", "Max", "Manager", 1999 );

	output(worker1.getInfo("familyName"));
	output(worker1.getInfo("firstName"));
	output(worker1.getInfo("role"));
	output(worker1.getInfo("yearOfEntry"));

	output(worker2.getInfo("familyName"));
	output(worker2.getInfo("firstName"));
	output(worker2.getInfo("role"));
	output(worker2.getInfo("yearOfEntry"));
	
	output(worker3.getInfo("familyName"));
	output(worker3.getInfo("firstName"));
	output(worker3.getInfo("role"));
	output(worker3.getInfo("yearOfEntry"));
}


	private static void output(String outStr) {
		System.out.println(outStr);
	}

}

