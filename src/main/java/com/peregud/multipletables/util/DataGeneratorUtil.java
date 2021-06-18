package com.peregud.multipletables.util;

import com.peregud.multipletables.model.Student;
import com.peregud.multipletables.model.Task;
import com.peregud.multipletables.model.Teacher;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@UtilityClass
public class DataGeneratorUtil {
    private final List<String> FIRST_NAMES;
    private final List<String> LAST_NAMES;
    private final List<String> TASK;
    private final Random RANDOM = new Random();

    static {
        FIRST_NAMES = Arrays.asList("James", "Robert", "Michael", "David", "Richard");
        LAST_NAMES = Arrays.asList("Smith", "Johnson", "Williams", "Brown", "Jones");
        TASK = Arrays.asList("Task 1", "Task 2", "Task 3", "Task 4", "Task 5");
    }

    public List<Student> buildStudent(int count) {
        return Stream.generate(() -> Student.builder()
                .firstName(FIRST_NAMES.get(RANDOM.nextInt(FIRST_NAMES.size())))
                .lastName(LAST_NAMES.get(RANDOM.nextInt(LAST_NAMES.size())))
                .build())
                .limit(count)
                .collect(Collectors.toList());
    }

    public List<Task> buildTask(int count) {
        return Stream.generate(() -> Task.builder()
                .taskName(TASK.get(RANDOM.nextInt(TASK.size())))
                .build())
                .limit(count)
                .collect(Collectors.toList());
    }

    public List<Teacher> buildTeacher(int count) {
        return Stream.generate(() -> Teacher.builder()
                .firstName(FIRST_NAMES.get(RANDOM.nextInt(FIRST_NAMES.size())))
                .lastName(LAST_NAMES.get(RANDOM.nextInt(LAST_NAMES.size())))
                .build())
                .limit(count)
                .collect(Collectors.toList());
    }
}
