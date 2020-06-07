package questao4;

public class Secretario extends Professor {

	@Override
	public void setDisciplinaM(String disciplinaM) {
		super.setDisciplinaM(disciplinaM);
	}
	@Override
	public String toString() {
		return "\n--------SECRETARIA-------\n"+"\nNome: "+nome+"\nDisciplina: "+getDisciplinaM();
	}
	
}
