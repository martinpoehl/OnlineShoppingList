package GUI;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import com.codeborne.selenide.Configuration;

public class ShowArticleWebappTest {

	@Test
	public void addNewArticle() throws InterruptedException {
		Configuration.browser ="chrome";
		open("http://localhost:8080/articles/list");
		ListArticlePage listArticlePage = page(ListArticlePage.class);
		listArticlePage
		.clickBtnNewArticle()
		.fillBezeichnung()
		.fillCategorie()
		.fillPreis()
		.fillStatus()
		.save();
		Thread.sleep(14000);
	}
	
	@Test
	public void editArticle() throws InterruptedException {
		Configuration.browser ="chrome";
		open("http://localhost:8080/articles/list");
		ListArticlePage listArticlePage = page(ListArticlePage.class);
		listArticlePage
		.clickBtnArticleEdit()
		.fillPreis()
		.save();
		Thread.sleep(4000);
	}
	
	@Test
	public void deleteArticle() throws InterruptedException {
		Configuration.browser ="chrome";
		open("http://localhost:8080/articles/list");
		ListArticlePage listArticlePage = page(ListArticlePage.class);
		listArticlePage
		.clickBtnDelete();
		Thread.sleep(4000);
	}
	
	@Test
	public void setDoneArticle() throws InterruptedException {
		Configuration.browser ="chrome";
		open("http://localhost:8080/articles/list");
		ListArticlePage listArticlePage = page(ListArticlePage.class);
		listArticlePage
		.clickBtnArticleDone();
		Thread.sleep(4000);
	}
}