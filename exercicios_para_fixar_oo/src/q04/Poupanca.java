package q04;

// interface a gente herda e dps implementa
// em classes a gente herda e ja utiliza

public class Poupanca extends Conta{
	// ISSO SERIA SOBRESCRITA?
	@Override
	public void depositar(float v, Conta c) {
		saldoAtual += v;
		saldoAtual = aplicarRenda(v);
		System.out.println("\nDeposito de "+v+"R$ na conta "+c.numeroConta+" realizado, saldo atual da conta: "+c.saldoAtual+"R$");
	}
	@Override
	public void saldo(Conta c) {
		System.out.println("\nSaldo da conta "+c.numeroConta+": "+c.saldoAtual);
	}
	@Override
	public void sacar(float v, Conta c) {
		saldoAtual -= v;
		System.out.println("\nSaque de "+v+"R$ da conta "+c.numeroConta+" realizado, saldo atual e de: "+c.saldoAtual+"R$");
	}
	@Override
	public void imprimirInformacao() {
		System.out.println("\t - Tipo: Poupanca");
		System.out.println("\t - Numero: "+this.numeroConta);
		System.out.println("\t - Saldo: "+this.saldoAtual);
	}
	public float aplicarRenda(float s) {
		return s + 5;
	}
}
