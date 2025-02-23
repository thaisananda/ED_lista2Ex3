package controller;

public class Controller09 {
	
	public Controller09() {
		super();
	}

	public String inverterString(String palavra) {
		
		// Condição de parada: se a string for vazia ou tiver um caractere, retorna ela mesma
		if (palavra.length() <= 1) {
			return palavra;
		
			// Pegamos o último caractere e chamamos recursivamente para o restante da string
		} else {
			return palavra.substring(palavra.length() - 1) + inverterString(palavra.substring(0, palavra.length() - 1));
		}
	}
}
