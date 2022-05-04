package ch.stfw.hfit18.onlineShoppingList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShoppingListApplication {
	
	public static void main(String[] args) {
		try {
			SpringApplication.run(OnlineShoppingListApplication.class, args);
		} catch (Throwable e) {
			if (e.getClass().getName().contains("SilentExitException")) {
				System.out.println("Spring is restarting the main thread - See spring-boot-devtools");
			} else {
				System.err.println("Application crashed!");
			}
		}
	}
}