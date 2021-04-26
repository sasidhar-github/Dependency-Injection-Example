package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean
	@Scope("prototype")
	public Car getCar() {
		return new Car(getEngine());
	} 

	@Bean
	public Engine getEngine() {
		return new Engine();
	}
}
