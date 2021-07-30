package di.calculator.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di.java.Config;

public class CalculatorMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCal.class);
		MyCalculator mycal = context.getBean("mycal", MyCalculator.class);
		mycal.printResult();
	}

}