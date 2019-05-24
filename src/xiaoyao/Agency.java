package xiaoyao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myInterface.Person;

public class Agency {

	public static void main(String[] args) {
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person man = (Person)appcontext.getBean("man");
		Person woman = (Person)appcontext.getBean("woman");
		System.out.println(man);
		System.out.println(woman);
		
		man.love();
		woman.love();
	}

}
