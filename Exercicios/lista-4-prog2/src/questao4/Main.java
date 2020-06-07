package questao4;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.nome = "Josue";
		aluno.idade = 13;
		aluno.nota = 9.9;
		aluno.sexo = "M";
		aluno.matricula = "12345";
		System.out.println(aluno.toString());
		
		Professor prof = new Professor();
		
		prof.nome = "Jorge";
		prof.disciplinaM = "Ciência";
		prof.idade = 89;
		prof.qntProvas = 4;
		prof.sexo = "M";
		System.out.println(prof.toString());
	
		Secretario sec = new Secretario();
		
		sec.nome = prof.nome;
		sec.setDisciplinaM("Português");
		System.out.println(sec.toString());
	}
}
