package demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chinese implements Course {
	
	//field injection
	@Autowired
	@Qualifier("electricalbook")
	private Book textbook;


	@Override
	public String takeCourse() {
		return "aoe";
	}

	@Override
	public String gettextbook() {
		return textbook.getbook();
	}


	
	 

}
