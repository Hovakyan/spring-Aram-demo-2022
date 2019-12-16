package AramDemo2022.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
public class PatientEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surName;



    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    DoctorEntity doctorEntity;
}
