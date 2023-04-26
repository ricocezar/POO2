package POO;

public class PessoaFisica extends Cliente{
	
	private String cpf;

	public PessoaFisica(String nome, String endereço, String telefone, String cpf) {
		super(nome, endereço, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("\nDados do Cliente PF:");
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço: "+getEndereço());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("CPF: "+getCpf());
		
	}
	
}
