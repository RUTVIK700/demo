package com.cake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1HwApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cb;

	public static void main(String[] args) {
		SpringApplication.run(Week1HwApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(cb.CakeBaker());
	}
}

