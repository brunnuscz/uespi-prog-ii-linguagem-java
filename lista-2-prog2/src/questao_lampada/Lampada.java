package questao_lampada;

public class Lampada {
	boolean ligada;
	boolean desligada;

	public boolean getLiga() {
		return ligada;
	}

	public void liga(boolean ligada) {
		this.ligada = true;
	}

	public boolean getDesliga() {
		return desligada;
	}

	public void desliga(boolean desligada) {
		this.desligada = true;
	}

	public String observa() {
		if (ligada == true && desligada == false) {
			return "ligada";
		} else {
			return "desligada";
		}
	}
}