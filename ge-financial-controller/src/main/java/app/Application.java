package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
        System.out.println("Hello!!!!!!!!!!");
    }

}