package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		try{
			t.start();
		}catch (Exception e) {

		}
		SpringApplication.run(DemoApplication.class, args);
		System.out.print("finish");
	}


	static class DemoThread extends java.lang.Thread{
		@Override
		public void run() {
			System.out.print("test");
		}
	}
}
