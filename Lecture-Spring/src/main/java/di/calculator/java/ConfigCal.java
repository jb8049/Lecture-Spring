package di.calculator.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// xml을 사용하지 않고, 순수 자바로 객체 자동 생성해서 DI
@Configuration
@ComponentScan(basePackages = {"di.calculator.java"})
public class ConfigCal {
	
	/*
	 * @Bean public Calculator calculator() { return new Calculator(50,20); // 값을 직접
	 * 입력해주었음 }
	 * 
	 * @Bean public MyCalculator myCalculator() { return new MyCalculator(); }
	 */
	
	
}
