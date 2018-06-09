/* CSCI3130 Assignment2 Question1 Stage1
 * Date:05/06/2018
 * Description: A Validator for validating passwords strength
   2 rules for passwords: not equal to "password", at least 8 characters
 */

public class Validator {
	private String password;
	
	public void setPwd(String password) {
		this.password=password;
	}
	public boolean getValidation() {
		boolean check;
		//for validation rules for stage1: not equals to "password", not less than 8 characters
		String str=password.toLowerCase();
		if(str.equals("password") || str.length()<9) 
			check=false;
		else
			check=true;
		return check;
	}
}

