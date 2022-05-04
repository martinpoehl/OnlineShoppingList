package ch.stfw.hfit18.onlineShoppingList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.stfw.hfit18.onlineShoppingList.model.Article;
import ch.stfw.hfit18.onlineShoppingList.model.Status;
import ch.stfw.hfit18.onlineShoppingList.repo.ArticleRepository;

@Controller
@RequestMapping("/articles/")
public class ArticleController {
	
	@Autowired
	private ArticleRepository articleRepository;

	@GetMapping("list")
	public String list(Model model) {
		model.addAttribute("articles", articleRepository.findByStatus(Status.In_Bearbeitung));
		return "articleList";
	}
	
	@GetMapping("done")
	public String done(Model model) {
		model.addAttribute("articles", articleRepository.findByStatus(Status.Erledigt));
		return "articleHistoryList";
	}
	
	@GetMapping("deleteAllDone")
	public String deleteAllDone(Model model) {
		for (Article article : articleRepository.findByStatus(Status.Erledigt))
			articleRepository.delete(article);
		return "redirect:done";
	}
	
	@GetMapping("add")
	public String addArticle(Article article) {
		return "addArticle";
	}

	@PostMapping("add")
	public String addArticle(Article article, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "addArticle";
		}
		articleRepository.save(article);
		return "redirect:list";
	}

	@GetMapping("edit/{id}")
	public String editArticle(@PathVariable("id") long id, Model model) {
		Article article = articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id));
		model.addAttribute("article", article);
		return "updateArticle";
	}

	@PostMapping("edit/{id}")
	public String editArticle(@PathVariable("id") long id, Article article, BindingResult result,
		Model model) {
		if (result.hasErrors()) {
			article.setId(id);
			return "updateArticle";
		}
		articleRepository.save(article);
		if(article.getStatus() == Status.In_Bearbeitung)
			return "redirect:../list";
		else
			return "redirect:../done";
	}

	@GetMapping("delete/{id}")
	public String deleteArticle(@PathVariable("id") long id, Model model) {
		Article article = articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id));
		articleRepository.delete(article);
		if(article.getStatus() == Status.In_Bearbeitung)
			return "redirect:../list";
		else
			return "redirect:../done";
	}
	
	@GetMapping("setDone/{id}")
	public String setDoneArticle(@PathVariable("id") long id, Model model) {
		Article article = articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id));
		article.setStatus(Status.Erledigt);
		articleRepository.save(article);
		return "redirect:../list";	
		}
}

