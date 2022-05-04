package GUI;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import com.codeborne.selenide.Configuration;

public class ShowArticleHistoryWebapp {

	@Test
	public void testClearHistoryList() throws InterruptedException {
		Configuration.browser ="chrome";
		open("http://localhost:8080/articles/done");
		ListArticlePage listArticlePage = page(ListArticlePage.class);
		listArticlePage
		.clickBtnClearList();
		Thread.sleep(4000);
	}
}