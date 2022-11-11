package questao4;

public class Aluno extends Pessoa {

	double nota;
	String matricula;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "\n--------ALUNO--------\n"+
			   "\nNome: "+nome+
			   "\nSexo: "+sexo+
			   "\nMatricula: "+matricula+
			   "\nNota: "+nota+
			   "\nIdade: "+idade;
	}
}
