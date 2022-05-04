package ch.stfw.hfit18.onlineShoppingList.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "bezeichnung")
	private String bezeichnung;

	@Column(name = "kategorie")
	@Enumerated(EnumType.STRING)
	private Categorie categorie;
	
	@Column(name = "preis")
	private Double preis;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private Status status;
	

	@ManyToOne
	private ShoppingList shoppingList;
	
	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Double getPreis() {
		return preis;
	}
	
	public void setPreis(Double preis) {
		this.preis = preis;
	}
	
	public void setEinkaufsliste(ShoppingList shoppingList) {
		this.shoppingList = shoppingList;
	}
	
	public ShoppingList getEinkaufsliste() {
		return shoppingList;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}
}	