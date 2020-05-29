package com.example.dyupdate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.dyupdate.dao"})
public class DyupdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DyupdateApplication.class, args);
	}

}
