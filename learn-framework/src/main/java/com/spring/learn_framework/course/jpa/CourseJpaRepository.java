package com.spring.learn_framework.course.jpa;

import com.spring.learn_framework.course.CourseJpa;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insert(CourseJpa courseJpa) {
        entityManager.merge(courseJpa);
    }

    public CourseJpa findById(long id) {
        return entityManager.find(CourseJpa.class, id);
    }

    @Transactional
    public void deleteById(long id) {
        CourseJpa courseJpa = entityManager.find(CourseJpa.class, id);
        entityManager.remove(courseJpa);
    }
}
