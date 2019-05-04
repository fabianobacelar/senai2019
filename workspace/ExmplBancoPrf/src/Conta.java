public class Conta {

	public int numero;
//	public String nome;
	private Cliente cliente; 
	private double saldo;
	private String extrato = "";
	
	Conta (Cliente cliente){
		this.cliente = cliente;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getExtrato(){
		return extrato;
	}

	public boolean depositar(double valor) {
		extrato += "\nC + " + valor;
		saldo += valor;
		return true;
	}

	public boolean sacar(double valor) {

		if (valor > saldo) {
			return false;
		}
		extrato += "\nD - " + valor;
		saldo -= valor;
		return true;
	}
	
}
