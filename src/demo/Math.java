package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//default bean id is lower case of first character, here is math

//no need of annotation in case of java config file
//we will add beans in config file
//@Component
public class Math implements Course {

	private Book textbook;
	
	//constructor injection, spring will scan for a component that will implement
	//the book interface, autowire will do that
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.phone}")
	private String phone;
	
	
	public Math(Book textbook) {
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

	public Book getTextbook() {
		return textbook;
	}

	public void setTextbook(Book textbook) {
		this.textbook = textbook;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	


}
