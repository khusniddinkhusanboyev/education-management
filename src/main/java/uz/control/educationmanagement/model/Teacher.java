package uz.control.educationmanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "teachers")
public class Teacher extends Indexing{
    private String name;
    private String surename;
    private String email;
    private Long number;
    private String description;
    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
}
