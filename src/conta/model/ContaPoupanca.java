package conta.model;

public class ContaPoupanca extends Conta {

	private float taxaJuros;

	public ContaPoupanca(int numeroAgencia, int numeroConta, int tipoConta, String nomeTitular, float saldoInicial, float taxaJuros) {
        super(numeroAgencia, numeroConta, tipoConta, nomeTitular, saldoInicial);
        this.taxaJuros = taxaJuros;
	}

	public float ContaPoupanca() {
		return taxaJuros;
	}

	public void setContaPoupanca(int aniversario) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.taxaJuros);
	}

}