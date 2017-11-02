package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//default bean id is lower case of first character, here is math
@Component
public class Math implements Course {

	private Book textbook;
	
	//constructor injection, spring will scan for a component that will implement
	//the book interface, autowire will do that
	
	
	@Autowired
	
	public Math(@Qualifier("electricalbook")Book textbook) {
		this.textbook = textbook;
	}

	@Override
	public String takeCourse() {
		// TODO Auto-generated method stub
		return "1 + 1";
	}

	@Override
	public String gettextbook() {
		// TODO Auto-generated method stub
		return textbook.getbook();
	}



}
