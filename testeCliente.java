package POO;

public class testeCliente {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("Ricardo", "Av. itapuã, 77", "11961811222", "00177179420");
		PessoaFisica pf2 = new PessoaFisica("Gabriela", "Av. itapuã, 77", "11961603145", "05482622480");
		PessoaFisica pf3 = new PessoaFisica("Manuela", "Av. Vale de miranda, 1462", "849991285475", "03040587210");
		PessoaFisica pf4 = new PessoaFisica("Rafaela", "Av. Vale de miranda, 1462", "84998741254", "08702781470");
		
		pf1.visualizar();
		pf2.visualizar();
		pf3.visualizar();
		pf4.visualizar();
		      
		
		PessoaJuridica pj1 = new PessoaJuridica("Gabriela", "Av. Itapuã, 77", "11961811222", "503405105001-10");
		PessoaJuridica pj2 = new PessoaJuridica("Ricardo", "Av. Itapuã, 77", "11961603145", "7059282450001-50");
		PessoaJuridica pj3 = new PessoaJuridica("Witamara", "Av. Vale de miranda, 1462", "199991285475", "405958142001-70");
		PessoaJuridica pj4 = new PessoaJuridica("Fernanda", "Av. Vale de miranda, 1462", "13998741254", "305847958001-10");
		
		pj1.visualizar();
		pj2.visualizar();
		pj3.visualizar();
		pj4.visualizar();
     }

}
