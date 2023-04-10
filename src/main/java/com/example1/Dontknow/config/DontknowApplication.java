package com.example1.Dontknow.config;

//import org.omg.CORBA.Environment;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
//只能扫描这个类下面的子包 所以需要添加一个注解
@ComponentScan("com.example1")
//扫描Mapper
@MapperScan("com.example1.Dontknow.mapper")
public class DontknowApplication {

	private static final Logger LOG = LoggerFactory.getLogger(DontknowApplication.class);

	public static void main(String[] args)
	{
		SpringApplication app = new SpringApplication(DontknowApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("启动成功！！");
		LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
	}

}
