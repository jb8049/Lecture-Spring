package di.calculator01;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	private int a;
	private int b;
	
	public Calculator(int a, int b) {
		this.a = a; 
		this.b = b;
		System.out.println("Calculator()...");
	}
	
	public int getSum() {
		return a+b;
	}
	
	public int getSub() {
		return a-b;
	}
	
	public int getMul() {
		return a*b;
	}
	
	public int getDiv() {
		return a/b;
	}
	
}
