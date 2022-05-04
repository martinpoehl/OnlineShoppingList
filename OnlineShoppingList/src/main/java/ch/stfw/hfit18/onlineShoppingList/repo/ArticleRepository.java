package ch.stfw.hfit18.onlineShoppingList.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ch.stfw.hfit18.onlineShoppingList.model.Article;
import ch.stfw.hfit18.onlineShoppingList.model.Status;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
	List<Article> findByStatus(Status status);
}