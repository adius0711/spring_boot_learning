package com.spring.learn_framework;

import com.spring.learn_framework.game.GameRunner;
import com.spring.learn_framework.game.MarioGame;
import com.spring.learn_framework.game.SuperContra;
import com.spring.learn_framework.game_loose_couple.GameRunnerL;
import com.spring.learn_framework.game_loose_couple.PacMan;
import com.spring.learn_framework.spring_loose_couple.GameRunnerS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnFrameworkApplication.class, args);

//		Here the code is tightly coupled. For every creation of new game i.e., the new class,
//		we had to create a new constructor in the GameRunner class and pass the new game as the argument.
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();

		SuperContra superContra = new SuperContra();
		GameRunner runner1 = new GameRunner(superContra);
		runner1.runSuperContra();

//		For the below code, I have made the code loosely coupled by creating a interface and implementing it to each class.
//		By doing that, you don't need to change the GameRunner class code everytime a new game has been created.
		PacMan pacMan = new PacMan();
		GameRunnerL runnerL = new GameRunnerL(pacMan);
		runnerL.run();

//		Here, we used spring boot annotations like @Component and @Autowired.
//		By using these annotations, we don't have to manually create the instances of the class. Spring does it for us.
		GameRunnerS runnerS = context.getBean(GameRunnerS.class);
		runnerS.run();
	}

}
