package com.el.StudyManager.model;

import javax.persistence.*;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long id;
    @NotBlank
    private String title;
    private String course;
    private String type;
    private Date dueDate;
    private String body;
}
