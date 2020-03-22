package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class AulaOverride {

	public static void main(String[] args) {
		Conta cta1 = new Conta(1001, "Alex", 1000.0);
		cta1.saque(200.0);
		System.out.printf("Saldo Conta: %.2f%n", cta1.getSaldo());
		
		Conta cta2 = new ContaPoupanca(1002, "Bob", 1000.0, 0.05);
		cta2.saque(200.0);
		System.out.printf("Saldo Conta Poupança: %.2f%n", cta2.getSaldo());
		
		Conta cta3 = new ContaEmpresa(1003, "Nada SA", 1000.0, 2000.0);
		cta3.saque(200.00);
		System.out.printf("Saldo Conta Empresa: %.2f%n", cta3.getSaldo());
	}

}
