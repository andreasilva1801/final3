
public class folhapagamento {
     public static void main(String[] args) {
		
		empregado lista[];  // declarei uma LISTA (Vetor, ARRAY) de Empregados;
		
		// preciso definir o tamanho dela
		lista = new empregado[10];  // defini agora que tenho uma lista de 10 referências a empregados
	    // é como se eu tivesse lista0, lista1, lista2, lista3,..., lista9
		
		
		// criar cada um dos objetos
		lista[0] = new empregado("Isidro", "Professor", 2000);
		lista[1] = new empregado("Jose", "Vendedor", 1500);
		lista[2] = new empregado("Pedro", "Coordenador", 2500);
		lista[3] = new empregado("Vera", "Diretora", 3000);
		lista[4] = new empregado("Claudete", "Inspetora", 1800);
		lista[5] = new empregado("Vicente", "Motorista", 2000);
		lista[6] = new empregado("Paulo", "Contador", 2300);
		lista[7] = new empregado("Ana", "Advogada", 3500);
		lista[8] = new empregado("Caique", "Programador", 2700);
		lista[9] = new empregado("Priscilla", "Designer", 2000);
		
		lista[0].aumentarSalario(10.0);
		lista[1].aumentarSalario(20.0);
		lista[2].aumentarSalario(10.0);
		lista[3].aumentarSalario(5.0);
		lista[4].aumentarSalario(0.0);
		lista[5].aumentarSalario(10.0);
		lista[6].aumentarSalario(10.0);
		lista[7].aumentarSalario(30.0);
		lista[8].aumentarSalario(10.0);
		lista[9].aumentarSalario(2.0);		
					
		for (int posicao = 0; posicao < 10; posicao++) {
			System.out.println(lista[posicao].getNome()+"/"+lista[posicao].getCargo()+"  R$ "+lista[posicao].getSalario());
			System.out.println("Imposto do empregado = "+lista[posicao].calcularImposto());
			System.out.println("Salario liquido= R$ "+lista[posico].salarioLiquido());
		}
		
	}

}
