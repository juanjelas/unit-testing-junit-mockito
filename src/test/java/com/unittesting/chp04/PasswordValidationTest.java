package com.unittesting.chp04;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.unittesting.chp04.PasswordValidation;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class PasswordValidationTest {
	
	public Object[] getCheckMinimunLength(){
		return $("abc", "jasd" , "askdd", null);
	}
	
	@Test
	@Parameters(method="getCheckMinimunLength")
	public void checkMinimunLength(String password){
		PasswordValidation passValidation = new PasswordValidation();
		assertFalse(passValidation.validation(password));
	}
	
	public Object[] getCheckAtLeastDigit(){
		return $("sdadaasd", "qeqweqw" , "asadaqw");
	}
	
	@Test
	@Parameters(method="getCheckAtLeastDigit")
	public void checkAtLeastDigit(String password){
		PasswordValidation passValidation = new PasswordValidation();
		assertFalse(passValidation.validation(password));
	}
	
	public Object[] getCheckAtLeastCapital(){
		return $("0sdadaasd", "qeq34eqe" , "aaaas12qw");
	}
	
	@Test
	@Parameters(method="getCheckAtLeastCapital")
	public void checkAtLeastCapital(String password){
		PasswordValidation passValidation = new PasswordValidation();
		assertFalse(passValidation.validation(password));
	}

	public Object[] getCorrectPassword(){
		return $("0sdaDAAsd", "qeq34eqW" , "aADAS12qw");
	}
	
	@Test
	@Parameters(method="getCorrectPassword")
	public void correctPassword(String password){
		PasswordValidation passValidation = new PasswordValidation();
		assertTrue(passValidation.validation(password));
	}

}
