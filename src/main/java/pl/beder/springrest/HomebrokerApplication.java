package pl.beder.springrest;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.beder.springrest.utils.BootStrap;

import javax.annotation.PostConstruct;

@SpringBootApplication
@AllArgsConstructor
public class HomebrokerApplication {

	private BootStrap bootStrap;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(HomebrokerApplication.class, args);
	}

	@PostConstruct
	public void init() {
		bootStrap.initializeRepository();
	}

}
