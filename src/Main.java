
public class Main {

	public static void main(String[] args) {

		Pessoa pessoal = new Pessoa("Jo�o", 20, "Almeida", "045.492.65");
		
		pessoal.setIdade(21);
		
		System.out.println("A pessoa" + " " + pessoal.getNome() + " foi cadastrada com sucecsso.");

	}

}
