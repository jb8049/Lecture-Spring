package aop.java;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

//VO같은게 아니라서 @Service로 지정함
@Service
@Aspect
public class MyAspect {
	
	@Before("execution(void aop.*.*.work())")
	// 삽입되는 시점에 대한 정보를 알기 위해서는 JoinPoint를 써야함
	public void gotoOffice(JoinPoint joinPoint) {
		
		// 핵심 코드가 실행되면서 공통 코드가 삽입되는데,
		// 이 시점의 정보들을 알 수 있는 joinPoint
		
		System.out.println("출근을 합니다");
	}
	
	@After("execution(void aop.java.*.work())")
	public void getOffOffice() {
		
		System.out.println("퇴근을 합니다");
		
		
	}
}
