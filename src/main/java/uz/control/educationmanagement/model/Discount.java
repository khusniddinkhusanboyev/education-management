package uz.control.educationmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "discounts")

public class Discount extends Indexing {

   @ManyToOne
   @JoinColumn(name = "student_id")
   private Student student;
   private Integer discount;
   @ManyToOne
   @JoinColumn(name = "subject_id")
   private Subject subject;





}
