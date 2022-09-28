package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student taylor = new Student(
                    1L,
                    "Taylor",
                    "taylor@gmail.com",
                    LocalDate.of(1999, APRIL, 3)

            );

            Student peter = new Student(

                    "Peter",
                    "peter@gmail.com",
                    LocalDate.of(2003, APRIL, 3)
            );

            studentRepository.saveAll(
                    List.of(taylor,peter)
            );
        };
}
}

