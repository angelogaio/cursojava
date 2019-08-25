package course;

public class Nota {
	
	public String nome;
	public double t1;
	public double t2;
	public double t3;
	
	public double calculo(){
		 double tf = t1 + t2 + t3;
		 return tf;
	}
	public String toString() {
		return "FINAL GRADE = "
				+ String.format("%.2f",calculo());
	}

}
