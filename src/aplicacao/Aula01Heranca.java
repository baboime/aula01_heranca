package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Aula01Heranca {

	public static void main(String[] args) {
		
		Conta cta = new Conta(1001, "Alex", 0.0);
		
		ContaEmpresa ctaemp = new ContaEmpresa(2001, "Maria", 0.00, 500.00);
		
		//UPCASTING
		
		//Nenhum dos exemplos abaixo apresenta erro pois todos sao uma conta, a conta eh a superclasse
		//eh a conversao de um objeto da subclasse para a superclasse
		
		Conta cta1 = ctaemp; 
		Conta cta2 = new ContaEmpresa(2002, "Bob", 0.0, 200.0);
		Conta cta3 = new ContaPoupanca(3001, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		//eh o inverso do upcasting, trata-se da conversao de um objeto da subperclasse para a subclasse
		//nao eh possivel fazer esse tipo de associacao --> ContaEmpresa cta4 = cta2; pois nao eh seguro, necessario fazer o 
		// casting manual
		
		ContaEmpresa cta4 = (ContaEmpresa) cta2;
		cta4.emprestimo(100.0);
		
		// Conversao abaixo apresenta problema na execução, nao eh possivel fazer o downcasting de uma ContaPoupanca (cta3) 
		// para uma ContaEmpresa. pois uma ContaPoupanca eh uma Conta e não uma ContaEmpresa.
		// --> ContaEmpresa cta5 = (ContaEmpresa) cta3;
		
		//Como testar o downcasting
		
		if (cta3 instanceof ContaEmpresa) {
			ContaEmpresa cta5 = (ContaEmpresa) cta3;
			cta5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		if (cta3 instanceof ContaPoupanca) {
			ContaPoupanca cta5 = (ContaPoupanca) cta3;
			cta5.atualizaSaldo();
			System.out.println("Atualizado!");
		}
		

	}

}
