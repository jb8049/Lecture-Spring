package di.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 컨테이너를 만드는 설정을 .xml이 아닌 이 파일로 만든다, 순수 자바로
@Configuration 
@ComponentScan(basePackages = {"di.java"})  // 이걸 쓸려면 4가지 annotation 써줘야지!
public class Config {
	
	/*
	// bean 클래스를 대체하기 위한 annotaion을 적어줌
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean
	@Qualifier("hankook")   // 사용할 때 이름 너무 기니까
	public HankookTire hankookTire() {
		
		return new HankookTire();
	}
	
	@Bean
	@Qualifier("kumho")
	public KumhoTire kumhoTire() {
		
		return new KumhoTire();
	}
	
	// 이렇게 계속 쓰다보니.. 다쓰는게 좋아? 아까 component scan만들었었잖아
	// component-scan 쓰자 @ComponentScan 클래스 위로 올라가자 => 이거 써주고 나면, 여기에 코드가 있을 필요가 없네
	*/
	
	
}
