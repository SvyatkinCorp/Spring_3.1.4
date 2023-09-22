package com.spring.task3_1_4;

import com.spring.task3_1_4.configuration.Config;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
         AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);
        System.out.println("Answer: " + communication.getAnswer());

    }
}