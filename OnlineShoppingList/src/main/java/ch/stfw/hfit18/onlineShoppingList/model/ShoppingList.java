package ch.stfw.hfit18.onlineShoppingList.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoppingList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "seitenname")
	private String seitenname;

	
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}

	public void setSeitenname(String seitenname) {
		this.seitenname = seitenname;
	}
	public String getSeitenname() {
		return seitenname;
	}
}
