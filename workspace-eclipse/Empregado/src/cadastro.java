
public class cadastro {
	public static void main(String args[] ){
		// TODO Auto-generated method stub
		empregado c1,c2,c3;
		
		c1 = new empregado("Andrea Silva","faxineira",1200);
		c2 = new empregado("Vitor Cunha","vendedor",3200.12);
		c3 = new empregado("Ana Brito"," vendedor",1830.45);
		
		/*c1.setNome("ANDREA");
		c1.setCargo("faxineira");
		c1.setSalario(1200);
		
		c2.setNome("Vitor Cunha");
		c2.setCargo("vendedor");
		c2.setSalario(3200.12);
		
		c3.setNome ("ana brito");
		c3.setCargo("vendedor");
		c3.setSalario(1830.45);*/
		

		c1.exibirInformacao();
		c2.exibirInformacao();
		c3.exibirInformacao();
		System.out.println("DEPOIS DO AUMENTO");
		System.out.println("*******************");

		c1.aumentarSalario(10.0);
		c2.aumentarSalario(5.0);
		c3.aumentarSalario(2.0);
		
		c1.exibirInformacao();
		c2.exibirInformacao();
		c3.exibirInformacao();		
					

	}

}
