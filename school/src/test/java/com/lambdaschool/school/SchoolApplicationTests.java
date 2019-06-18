package com.lambdaschool.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SchoolApplicationTests.class)
public class SchoolApplicationTests
{

    public static void main(String[] args)
    {
        SpringApplication.run(SchoolApplication.class, args);
    }

}