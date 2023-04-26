package POO;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;

	public PessoaJuridica(String nome, String endereço, String telefone, String cnpj) {
		super(nome, endereço, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		System.out.println("\nDados do Cliente PJ:");
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço: "+getEndereço());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("CNPJ: "+getCnpj());
		
	}
	
	
}
