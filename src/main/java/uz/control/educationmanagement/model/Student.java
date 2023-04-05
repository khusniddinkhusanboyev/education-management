package uz.control.educationmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "students")
public class Student extends Indexing {
    private String name;
    private String surename;
    private Integer age;
    private String number;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    private LocalDate registrated_At;
    private Integer result;
}
