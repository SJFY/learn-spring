package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myapp {

	public static void main(String[] args) {
		
		//load string congfigration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Course thecourse = context.getBean("math", Course.class);
		
		//call methods 
		System.out.println(thecourse.takeCourse());
		System.out.println(thecourse.gettextbook());
	
		//close the context
		context.close();
		
	}

}
