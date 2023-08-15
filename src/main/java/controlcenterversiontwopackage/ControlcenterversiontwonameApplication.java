package controlcenterversiontwopackage;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;

import controlcenterversiontwopackage.model.User;

@SpringBootApplication
@MappedTypes(User.class)
@MapperScan("controlcenterversiontwopackage.mapper")
// @ComponentScan(basePackages = {"controlcenterversiontwopackage"})
public class ControlcenterversiontwonameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlcenterversiontwonameApplication.class, args);
	}

}
