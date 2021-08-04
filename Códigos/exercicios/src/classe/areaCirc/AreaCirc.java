package classe.areaCirc;

public class AreaCirc {

	double raio;
	final static double PI = 3.1416;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	final static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	
}
