package com.htc.amazon.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.exceptionHandler.UserDefinedException;

public class RemovingAItemFromTheCart extends TestBase {

	@Test
	public void RemovingItemFromCart() throws InterruptedException {
		try {
			childTest=test.createNode("Removing Item From Cart");
			remove.addToCartAndDeleteTheItemFromTheCart();
			childTest.pass("Add to Cart and Delete Item from the cart method is successfully exicuted");
		} catch (UserDefinedException e) {
			e.printStackTrace();
			Assert.fail("--REMOVING ITEM FROM CART TEST IS FAILED--");
		}


	}

}
