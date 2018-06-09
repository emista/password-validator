import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


import org.junit.*;

public class testValidator {
	static String str1="password", str2="abcd";
	static Validator v1, v2;
	
	@BeforeClass
	public static void intial() {
		v1=new Validator();
		v2=new Validator();
		v1.setPwd(str1);
		v2.setPwd(str2);
	}
	
	@Test
	public void testValidation() {
		boolean checkResult=v1.getValidation() || v2.getValidation();
		assertFalse(checkResult);
	}	
}
