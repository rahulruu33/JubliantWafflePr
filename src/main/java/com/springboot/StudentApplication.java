package com.springboot;

import com.springboot.BattleField.CollectionsPack.MapPractiseClass;
import com.springboot.BattleField.StringManipulation.StringSangamam;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import testPackage.TestClass;
import testPackage.TestClass2;
import testPackage.TestClass5;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class StudentApplication {


	public static void main(String[] args) throws ExecutionException, InterruptedException {
		// Start the Spring application and get the ApplicationContext
		ApplicationContext context = SpringApplication.run(StudentApplication.class, args);
//		TestClass2 testClass = new TestClass2();
		TestClass5 testClass5 = new TestClass5();
		String string = "{a+(b)";
		testClass5.testMethod(string);

	}


	@Bean
	public ApplicationRunner applicationStartup() {
		return args -> {
			System.out.println("\uD83C\uDF89 \uD83D\uDE80 Application started! Good to go! \uD83D\uDC4D\uD83C\uDFFD");
		};
	}

	public static void PracticeStringManipulation(){
		StringSangamam stringSangamam = new StringSangamam();
		stringSangamam.LearnStringManipulation();
	}


}
