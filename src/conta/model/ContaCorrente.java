package conta.model;

//ContaCorrente herda de Conta
public class ContaCorrente extends Conta {

	// Atributos
	private float limite;

	// Método Construtor
	public ContaCorrente(int numeroConta, int agencia, int tipo, String titular, float saldo, float limite) {

		// super() == Método Const. da Super Classe
		// Ex.: Conta(numeroConta, agencia, tipo, titular, saldo)
		super(numeroConta, agencia, tipo, titular, saldo);

		// Atributo da Classe ContaCorrente
		this.limite = limite;
	}

	// Métodos de Acesso da Classe ContaCorrente
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	// Métodos Especificos da Classe ContaCorrente

	@Override // Override = Sobrescrever
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	@Override // Override = Sobrescrever
	public void visualizar() {
		// palavra super. == chamada da Cuperclasse | Ex.: Conta.visualizar();
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

}