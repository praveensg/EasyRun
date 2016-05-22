package com.sg.easyrun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.sg.easyrun")
public class EasyRunApplication{

	public static void main(String[] args) throws Exception{
        SpringApplication.run(EasyRunApplication.class, args);
    }
}

