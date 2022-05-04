package GUI;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.codeborne.selenide.SelenideElement;

public class ListArticlePage {
	
	@FindBy(how = How.ID, using = "addArticle")
	private SelenideElement btnNewArticle;
	
	@FindBy(how = How.ID, using = "clearHistory")
	private SelenideElement btnClearList;
	
	@FindBy(how = How.ID, using = "setDelete")
	private SelenideElement btnArticleDelete;
	
	@FindBy(how = How.ID, using = "setEdit")
	private SelenideElement btnArticleEdit;
	
	@FindBy(how = How.CLASS_NAME, using = "setDone")
	private SelenideElement btnArticleDone;
	
	public EditArticlePage clickBtnNewArticle() {
		btnNewArticle.should(appear);
		btnNewArticle.click();
		return page(EditArticlePage.class);
	}
	
	public EditArticlePage clickBtnClearList() {
		btnClearList.should(appear);
		btnClearList.click();
		return page(EditArticlePage.class);
	}
	
	public EditArticlePage clickBtnDelete() {
		btnArticleDelete.should(appear);
		btnArticleDelete.click();
		return page(EditArticlePage.class);
	}
	
	public EditArticlePage clickBtnArticleEdit() {
		btnArticleEdit.should(appear);
		btnArticleEdit.click();
		return page(EditArticlePage.class);
		
	}

	public EditArticlePage clickBtnArticleDone() {
		btnArticleDone.should(appear);
		btnArticleDone.click();
		return page(EditArticlePage.class);
		
	}
}
