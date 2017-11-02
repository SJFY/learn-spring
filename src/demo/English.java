package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class English implements Course {

	//setter injection
	private Book textbook;
	public English() {
		System.out.println("inside the default constructor");
	}
	
	//create a setter method
	@Autowired
	@Qualifier("electricalbook")
	public void setBook(Book textbook) {
		System.out.println("inside the setter method");
		this.textbook = textbook;
	}
	@Override
	public String takeCourse() {
		return "Apple";
	}

	@Override
	public String gettextbook() {
		// TODO Auto-generated method stub
		return textbook.getbook();
	}

	


}
