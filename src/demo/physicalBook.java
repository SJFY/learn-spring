package demo;

import org.springframework.stereotype.Component;

@Component
public class physicalBook implements Book {

	@Override
	public String getbook() {
		return "Go borrow a book from Grainger";
	}

}
