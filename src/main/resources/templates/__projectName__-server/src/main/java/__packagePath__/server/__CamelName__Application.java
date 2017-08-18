package @packageName@.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class @CamelName@Application {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(@CamelName@Application.class);

		// To disabled web environment, change `true` to `false`
		application.setWebEnvironment(true);
		application.run(args);
	}
}
