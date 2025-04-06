package com.spring.learn_framework.course.jpa;

import com.spring.learn_framework.course.Course;
import com.spring.learn_framework.course.CourseJpa;
import com.spring.learn_framework.course.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception{
        courseJpaRepository.insert(new CourseJpa(1, "Learn AWS", "adityaat"));
        courseJpaRepository.insert(new CourseJpa(2, "Learn Azure", "adityaat"));

        courseJpaRepository.deleteById(1);

        System.out.println(courseJpaRepository.findById(2));
    }
}
