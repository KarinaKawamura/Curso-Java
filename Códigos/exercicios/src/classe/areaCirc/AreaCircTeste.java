package classe.areaCirc;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc area1 = new AreaCirc(10);
		area1.raio = 10;
		// area.pi = 100000; (alterou o valor de pi para 100000, quando static)
		
		AreaCirc area2 = new AreaCirc(10);
		area2.raio = 100;
		// area.pi = 100000; (alterou o valor de pi para 0, quando static)
		
		//AreaCirc.PI = 3.14;
		
		System.out.println(area1.area());

		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
				
	}

}
