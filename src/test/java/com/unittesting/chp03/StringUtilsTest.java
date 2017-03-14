package com.unittesting.chp03;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.unittesting.chp03.StringUtils;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {

	private static final Object[] getString() {
		return $($("primero", "oremirp"), $("segundo", "odnuges"));
	}

	@Test
	@Parameters(method = "getString")
	public void testReverse(String intro, String result) {
		assertEquals(intro, StringUtils.reverse(result));
	}

}
