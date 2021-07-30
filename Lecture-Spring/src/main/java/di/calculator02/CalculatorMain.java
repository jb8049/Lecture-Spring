package di.calculator02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-cal02.xml");
		MyCalculator my = context.getBean("my", MyCalculator.class);
		my.printResult();
	}

}