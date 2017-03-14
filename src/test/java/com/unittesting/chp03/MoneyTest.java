package com.unittesting.chp03;

import static org.junit.Assert.*;

import org.junit.Test;

import com.unittesting.chp03.Money;

public class MoneyTest {

	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Money money = new Money(25, "euro");
		assertEquals(25, money.getAmount());
		assertEquals("euro", money.getCurrency());
	}

	@Test
	public void testEqualsObject() {
		Money money = new Money(25, "euro");
		Money money2 = new Money(25, "dolar");
		Money money3 = new Money(13, "euro");
		Money money4 = new Money(25, "euro");
		assertNotEquals(money, money2);
		assertNotEquals(money3, money4);
		assertEquals(money, money4);
	}

}
