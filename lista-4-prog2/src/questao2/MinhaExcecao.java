package questao2;

public class MinhaExcecao extends Exception {
	
	
	public MinhaExcecao() {
	}

	public MinhaExcecao(String message) {
		super(message);
	}

	public MinhaExcecao(Throwable cause) {
		super(cause);
	}

	public MinhaExcecao(String message, Throwable cause) {
		super(message, cause);
	}

	public MinhaExcecao(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
