package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);	
		Car car1 = ctx.getBean(Car.class);
		Car car2 = ctx.getBean(Car.class);
		System.out.println(car1.showEngineHp());
		System.out.println(car2);
		((AnnotationConfigApplicationContext)ctx).close();
	}


}
