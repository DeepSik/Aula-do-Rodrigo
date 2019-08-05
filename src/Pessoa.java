public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String sobrenome;
    private String cpf;
   
	public Pessoa(String nome, Integer idade, String sobrenome, String cpf) { // Método Contrutor com campos 
		super();
		this.nome = nome;
		this.idade = idade;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}






     public Pessoa() { //Método constructor vazio 
		super();
		// TODO Auto-generated constructor stub
	}






	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public Integer getIdade() {
		return idade;
	}






	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	

	public String getSobrenome() {
		return sobrenome;
	}






	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}






	public String getCpf() {
		return cpf;
	}






	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
    
    
    
	
	
}
