package jose_rodolfo_prova2;

public abstract class Coordenador extends User {
	
	@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}
	public String telefone;
	public String senha;
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
