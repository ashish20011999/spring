package com.project.springstart;

import com.project.springstart.game.GameRunner;
import com.project.springstart.game.MarioGame;
import com.project.springstart.game.SuperContraGame;
import com.project.springstart.web.WebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project.springstart")//this is automatically done by @SpringBootApplication tag, this scans all the
//components in the package and its subpackage
public class SpringStartApplication {

	public static void main(String[] args) {
		//this line of code manages Application context
//		SpringApplication.run(SpringStartApplication.class, args); //this create instances of all the components

//		ConfigurableApplicationContext context = SpringApplication.run(SpringStartApplication.class, args);
//		GameRunner gameInstance = context.getBean(GameRunner.class);//creating and using an instance of the component class
		//this is called as bean

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();

//		GameRunner runner = new GameRunner(game);
//		GameRunner supercContraRunner = new GameRunner(game);
//		superContraRunner.setSuperContraGameRun(); //to run a super contra game we have to change the code this is tight coupling

//		gameInstance.run(); //tightly coupled code
		//we can avoid this using interface

		ConfigurableApplicationContext controller = SpringApplication.run(SpringStartApplication.class, args);
		WebController bean = controller.getBean(WebController.class);
		System.out.println(bean.returnSum());
	}
}
