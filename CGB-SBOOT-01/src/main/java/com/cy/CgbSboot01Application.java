package com.cy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/*
 * @SpringBootApplication  注解描述的类为
 * springboot的默认启动类，此类在启动时，会记载springboot
 * 核心依赖并且扫描此类所在包及子包中的资源（@Controller，@Component,
 * @Service,@Configuration）
 */
@SpringBootApplication
public class CgbSboot01Application implements CommandLineRunner {
	
	@Autowired
	private ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(CgbSboot01Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("ctx:"+ctx);
		
	}

}
