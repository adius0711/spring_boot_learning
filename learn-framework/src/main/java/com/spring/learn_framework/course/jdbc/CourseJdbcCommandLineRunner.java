package com.spring.learn_framework.course.jdbc;

import com.spring.learn_framework.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception{
        courseJdbcRepository.insert(new Course(1, "Learn AWS", "adityaat"));
        courseJdbcRepository.insert(new Course(2, "Learn Azure", "adityaat"));

        courseJdbcRepository.deleteById(1);

        System.out.println(courseJdbcRepository.findById(2));
    }
}
