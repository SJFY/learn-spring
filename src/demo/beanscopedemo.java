package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanscopedemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		//RETRIVE BEAN FROM APPLICATION CONTEXT
		Course a = context.getBean("myCourse", Course.class);
		
		Course b = context.getBean("myCourse", Course.class);
		
		//METHODS
		//CHECK IF THEY ARE THE SAME BEANS
		boolean result = (a == b);
		
		System.out.println("\nPointing to the same object " + result);
		
		System.out.println("\nMemory location for a " + a);
		
		System.out.println("\nMemory location for b " + b);
		
		System.out.println(a.gettextbook());
		//
		
		context.close();
	}

}
