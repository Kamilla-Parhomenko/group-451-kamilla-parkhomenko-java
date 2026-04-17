package packagename;

public abstract class User {

	String login;
	String password;
	
	public void chkpswd(String input) {
		if(input == password) {
			System.out.println("logged in successfully");
		} else {
			System.out.println("wrong password, try again");
		}
	}
}
