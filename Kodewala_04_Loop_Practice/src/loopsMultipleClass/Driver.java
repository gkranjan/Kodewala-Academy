package loopsMultipleClass;

public class Driver {

	public static void main(String[] args) {

		SBIBank obj1 = new SBIBank("Gautam", 100, 2265464);
		SBIBank obj2 = new SBIBank("ranjan", 500, 22265464);
		SBIBank obj3 = new SBIBank("kumar", 2000, 82265464);
		SBIBank obj4 = new SBIBank("Ajay", 635, 65665464);
		SBIBank obj5 = new SBIBank("Vijay", 5000, 277265464);
		SBIBank obj6 = new SBIBank("Mohan", 1000, 72265464);

		// obj3.display();

		SBIBank[] sbi = new SBIBank[6];

		sbi[0] = obj1;
		sbi[1] = obj2;
		sbi[2] = obj3;
		sbi[3] = obj4;
		sbi[4] = obj5;
		sbi[5] = obj6;

		for (int index = 0; index < sbi.length; index++) {
			if (sbi[index].balance < 2000) {
				sbi[index].display();
			}
		}

	}

}
