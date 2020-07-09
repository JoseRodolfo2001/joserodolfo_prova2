package jose_rodolfo_prova2;

public abstract class Aluno extends User{

		@Override
	public String login() {
		// TODO Auto-generated method stub
		return null;
	}
		public String matricula;
		public String senha;
		
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
}
