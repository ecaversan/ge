package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Application {
	
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
        System.out.println("Application started!");
    }

}
