package Chinthakayala.Appgamingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppgamingjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppgamingjavaApplication.class, args);
		MarioGame games = new MarioGame();
		//SuperContra game = new SuperContra();
		GameRunner gameRunner = new GameRunner(games);
		gameRunner.run();
	}

}
