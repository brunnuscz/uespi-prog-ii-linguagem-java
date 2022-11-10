package q08;

public class Casa {
	float preco;
	float comprimento;
	float largura;
	float altura;
	String local;
	String status;
	
	public Casa(float p, float c, float l, float a, String lc, String s){
		this.preco = p;
		this.comprimento = c;
		this.largura = l;
		this.altura = a;
		this.local = lc;
		this.status = s;
	}
	
	public String toString() {
		return "Local: "+this.local+
			   "\nPreco: "+this.preco+
			   "\nComprimento: "+this.comprimento+
			   "\nLargura: "+this.largura+
			   "\nAltura: "+this.altura+
		   	   "\nStatus: "+this.status;
	}
}
