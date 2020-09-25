
public class empregado {
	private String nome;
	private String cargo;
	private double salario;
	
	public empregado(String nome, String cargo, double salario) {
		this.nome =nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	// atribuir = set
	// consultar = get

	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getNome() {
		return nome;
	}

	public void setCargo(String novoCargo) {
		cargo = novoCargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setSalario(double novoSalario) {
		salario = novoSalario;
	}

	public double getSalario() {
		return salario;
	}

	public void exibirInformacao() {
		System.out.println(" CADASTRO FUNCIONARIO  ");
		System.out.println("Nome:" + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salario:  R$ %.2f\n", salario);
		System.out.printf("Imposto: R$ %.2f\n", calcularImposto());
		System.out.println("-----------------------------");
	}

	public void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}

	public double calcularImposto() {
		double Imposto;
		if (salario <= 2000) {
			Imposto = 0;
		} else if (salario <= 4500) {
			Imposto = salario * 0.10;
		} else {
			Imposto = 1200;
		}
		return Imposto;
	}
	public double salarioLiquido() {
		double liquido;
		
		liquido = (salario - Imposto);
		
		return liquido;
		
	}

}
