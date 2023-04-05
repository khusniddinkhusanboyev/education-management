package uz.control.educationmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "groups")
public class Group extends Indexing{
    private String groupName;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private Date date;
    private LocalDate localDate;
    private LocalDate started_at;
}
