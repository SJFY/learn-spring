package demo;

import org.springframework.stereotype.Component;

@Component
public class electricalbook implements Book {

	@Override
	public String getbook() {
		return "go search online";
	}

}
