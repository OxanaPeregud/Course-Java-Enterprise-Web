package com.peregud.clientvalidation.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "applicant")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicantId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private Long mobile;

    @Column
    private String course;

    @Column
    private String gender;
}
