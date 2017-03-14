package com.unittesting.chp03;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.unittesting.chp03.FahrenheitCelciusConverter;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static junitparams.JUnitParamsRunner.$;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelciusConverterTest {

	public Object[] getCelsius() {
		return $($(0, 32), $(37, 98), $(100, 212));
	}
	
	public Object[] getFahrenheit() {
		return $($(0, 32), $(37, 100), $(100, 212));
	}

	@Test
	@Parameters(method = "getCelsius")
	public void shouldConvertCelciusToFahrenheit(int celcius, int fahreheit) {
		assertEquals(fahreheit, FahrenheitCelciusConverter.toFahrenheit(celcius));
	}

	@Test
	@Parameters(method = "getFahrenheit")
	public void shouldConvertFahrenheitToCelcius(int celcius, int fahreheit) {
		assertEquals(celcius, FahrenheitCelciusConverter.toCelcius(fahreheit));
	}
}
