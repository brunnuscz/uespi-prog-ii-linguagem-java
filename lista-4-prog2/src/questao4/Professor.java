package questao4;

public class Professor extends Pessoa{
	String disciplinaM;
	int qntProvas;

	public String getDisciplinaM() {
		return disciplinaM;
	}

	public void setDisciplinaM(String disciplinaM) {
		this.disciplinaM = disciplinaM;
	}

	public int getQntProvas() {
		return qntProvas;
	}

	public void setQntProvas(int qntProvas) {
		this.qntProvas = qntProvas;
	}
	
	@Override
	public String toString() {
		return "\n--------PROFESSOR--------\n"+
			   "\nNome: "+nome+
			   "\nIdade: "+idade+
			   "\nSexo: "+sexo+
			   "\nDisciplina Ministrada: "+disciplinaM+
			   "\nQuantidade de provas: "+qntProvas;
	}
	
	
}
