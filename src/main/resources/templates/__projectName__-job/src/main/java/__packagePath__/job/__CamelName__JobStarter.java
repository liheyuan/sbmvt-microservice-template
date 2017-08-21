package @packageName@.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author coder4
 */
@SpringBootApplication
public class @CamelName@JobStarter {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(@CamelName@JobStarter.class);
        application.setWebEnvironment(false);
        application.run(args);
    }

}
