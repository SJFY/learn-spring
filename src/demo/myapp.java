package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Course thecourse = context.getBean("myCourse", Course.class);
		System.out.println(thecourse.takeCourse());
		System.out.println(thecourse.gettextbook());
		context.close();
		
	}

}
