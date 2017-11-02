package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("demo")
@PropertySource("demo.properties")
public class demoConfig {

	//define bean for book
	@Bean
	public Book physicalBook() {
		return new physicalBook();
	}
	
	//define bean for course
	@Bean
	public Course Math() {
		return new Math(physicalBook());
	}
}
