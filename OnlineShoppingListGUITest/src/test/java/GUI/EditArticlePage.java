package GUI;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

public class EditArticlePage {
		
	@FindBy(how = How.ID, using = "bezeichnung")
	private SelenideElement inputBezeichnung;
	
	@FindBy(how = How.ID, using = "categorie")
	private SelenideElement inputCategorie;
	
	@FindBy(how = How.ID, using = "preis")
	private SelenideElement inputPreis;
	
	@FindBy(how = How.ID, using = "status")
	private SelenideElement inputStatus;
	
	@FindBy(how = How.CLASS_NAME, using = "btn-primary")
	private SelenideElement btnSave;
	
	public EditArticlePage fillBezeichnung() {
		inputBezeichnung.should(appear);
		inputBezeichnung.setValue("Apfel");
		return page(EditArticlePage.class);
	}
	
	public EditArticlePage fillCategorie() {
		inputCategorie.should(appear);
		inputCategorie.selectOption(0);
		return page(EditArticlePage.class);
	}
	
	public EditArticlePage fillPreis() {
		inputPreis.should(appear);
		inputPreis.setValue("3.20");
		return page(EditArticlePage.class);
	}
	
	public EditArticlePage fillStatus() {
		inputStatus.should(appear);
		inputStatus.selectOption(0);
		return page(EditArticlePage.class);
	}
	
	public ListArticlePage save() {
		btnSave.should(appear);
		btnSave.click();
		return page(ListArticlePage.class);
	}
}
