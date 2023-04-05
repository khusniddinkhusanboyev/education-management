package uz.control.educationmanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "subjects")
public class Subject extends Indexing{

    private String subjectName;
    private Integer Price;
    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}
