package re.register.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@ComponentScan({ "re.register.*" })
@PropertySource({ "classpath:config.properties" })
public class AppSpringBoot {

    public static void main(String[] args) {

        SpringApplication.run(AppSpringBoot.class, args);


    }

}
