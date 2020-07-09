package jose_rodolfo_prova2;

public class LoginController {
	 public boolean login(User user) {
		 
		 if(user.login() != null) {
			 return true;
		 }
		 return false;
	 }
	
}
