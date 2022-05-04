package ch.stfw.hfit18.onlineShoppingList.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class articleTest {

	@Test
	void setBezeichnung_is_getBezeichnung() throws Exception {
		Article article = new Article();
		article.setBezeichnung("Apfel");
		assertEquals("Apfel", article.getBezeichnung());
	}
	
	@Test
	public void setCategorie_is_getCategorie() throws Exception {
		Article article = new Article();
		article.setCategorie(Categorie.Buecher);
		assertEquals(Categorie.Buecher, article.getCategorie());
	}
	
	@Test
	public void setPreis_is_getPreis() throws Exception {
		Article article = new Article();
		article.setPreis(12.50);
		assertEquals(12.50, article.getPreis());
	}

	@Test
	void setStatus_is_getStatus() throws Exception {
		Article article = new Article();
		article.setStatus(Status.Erledigt);
		assertEquals(Status.Erledigt, article.getStatus());
	}
}
