package aula112exer;

public class PessoaJuridica extends Contribuinte{
	
	private Double funcionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Double funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Double getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Double funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		if(funcionarios < 10.00) {
			return getRendaAnual() * 0.16;
		}
		else {
			return getRendaAnual() * 0.14;
		}
		
	}

}
