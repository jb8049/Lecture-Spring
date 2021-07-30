package aop.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// proxy 써줘야함
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"aop.java"})
@Configuration
public class Config {

}