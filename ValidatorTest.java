import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    static String str1="password", str2="Abcdef", str3="Apassword", str4="abcd1234", str5="ABCD1234", str6="Password123";
    static Validator v1, v2, v3, v4, v5,v6;

    @BeforeClass
    public static void intial() {
        v1=new Validator();
        v2=new Validator();
        v3=new Validator();
        v4=new Validator();
        v5=new Validator();
        v6=new Validator();
        v1.setPwd(str1);
        v2.setPwd(str2);
        v3.setPwd(str3);
        v4.setPwd(str4);
        v5.setPwd(str5);
        v6.setPwd(str6);
    }

    //check rule1: not equal to "password"
    @Test
    public void testPwdEqual() {
        boolean checkResult=v1.getValidation();
        assertFalse(checkResult);
        System.out.println(checkResult);
    }
    //check rule2: at least 8 characters
    @Test
    public void testPwdLength() {
        boolean checkResult=v2.getValidation();
        assertFalse(checkResult);
        System.out.println(checkResult);
    }
    //check rule3: contains at least one number
    @Test
    public void testPwdNum() {
        boolean checkResult=v3.getValidation();
        assertFalse(checkResult);
        System.out.println(checkResult);
    }
    //check rule4: contains at least one upper case letter
    @Test
    public void testPwdUpper() {
        boolean checkResult=v4.getValidation();
        assertFalse(checkResult);
        System.out.println(checkResult);
    }
    //check rule5: contains at least one lower case letter
    @Test
    public void testPwdLower() {
        boolean checkResult=v5.getValidation();
        assertFalse(checkResult);
        System.out.println(checkResult);
    }
    
    @Test
    public void testTrue() {
    	boolean checkResult=v6.getValidation();
    	int r1, r2, r3, r4, r5, finalR;
    	r1=v6.checkPwdEqual();
    	r2=v6.checkPwdLength();
    	r3=v6.checkPwdNum();
    	r4=v6.checkPwdUpper();
    	r5=v6.checkPwdLower();
    	finalR=r1+r2+r3+r4+r5;
    	System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+checkResult);
    	assertTrue(checkResult);
    }

}