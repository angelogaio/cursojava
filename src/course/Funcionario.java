package course;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
		}
	public void addSalario(double imposto) {
		this.salarioBruto += salarioBruto * (imposto/100);
	}
	
}
	
