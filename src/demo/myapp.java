package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myapp {

	public static void main(String[] args) {
		
		//load string congfigration file
		//different with the xml config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(demoConfig.class);
		
		//retrieve bean from spring container
		Course thecourse = context.getBean("Math", Course.class);
		
		//call methods 
		System.out.println(thecourse.takeCourse());
		System.out.println(thecourse.gettextbook());
		
		Math matha = context.getBean("Math", Math.class);
		System.out.println(matha.getPhone());
	
		//close the context
		context.close();
		
	}

}
