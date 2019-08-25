package course;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double area() {
		double a = (largura * altura);
		return a;
	}
	
	public double perimetro() {
		double p = 2*(largura + altura);
		return p;
	}
	
	public double diagonal() {
		double d = (largura*largura)+(altura*altura);
		return Math.sqrt(d);
	}
}
