package com.peregud.criteriajpa.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.io.Serializable;

@StaticMetamodel(Student.class)
public class Student_ implements Serializable {
    public static volatile SingularAttribute<Student, Integer> id;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, String> course;
    public static volatile SingularAttribute<Student, Integer> fee;
}