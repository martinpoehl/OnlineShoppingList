package ch.stfw.hfit18.onlineShoppingList.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class shoppingListTest {

	@Test
	void setSeitenname_is_getSeitenname() {
		ShoppingList shoppingList = new ShoppingList();
		shoppingList.setSeitenname("Hauptseite");
		assertEquals("Hauptseite", shoppingList.getSeitenname());
	}
}