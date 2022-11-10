package questao2;

public class Empregado extends Pessoa {
	double salario;
	String matricula;

	public double valorInss() {
		return salario + (salario * 0.11);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "\nEMPREGADO\n"+"\nNome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo+"\nSalario Atual: "+salario+"\nNovo salario: "+valorInss()+"\nMatricula: "+matricula;
	}
}
