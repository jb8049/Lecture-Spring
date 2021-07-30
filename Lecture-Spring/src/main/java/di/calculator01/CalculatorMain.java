package di.calculator01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-cal01.xml");
		MyCalculator myCal = context.getBean("myCalculator", MyCalculator.class);
		
		myCal.printResult();
	}

}
