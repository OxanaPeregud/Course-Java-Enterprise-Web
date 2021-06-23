package com.peregud.criteriajpa.util;

import com.peregud.criteriajpa.model.Student;
import lombok.experimental.UtilityClass;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@UtilityClass
public class DataGeneratorUtil {
    private final List<String> NAMES;
    private final List<String> COURSE;
    private final Random RANDOM = new Random();

    static {
        NAMES = Arrays.asList("James", "Robert", "Michael", "David", "Richard");
        COURSE = Arrays.asList("Java", "JavaScript", "C++", "C#", "Python");
    }

    public List<Student> buildStudent(int count) {
        return Stream.generate(() -> Student.builder()
                .name(NAMES.get(RANDOM.nextInt(NAMES.size())))
                .course(COURSE.get(RANDOM.nextInt(COURSE.size())))
                .fee((int) ((Math.random() * (500 - 100)) + 100))
                .build())
                .limit(count)
                .collect(Collectors.toList());
    }

    public void saveData(int count) {
        EntityManager entityManager = HibernateUtil.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            buildStudent(count).forEach(entityManager::merge);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
