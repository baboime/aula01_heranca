package entidades;

public class ContaPoupanca extends Conta{
	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizaSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public final void saque(double valor) {
		saldo -= valor;
	}
}
