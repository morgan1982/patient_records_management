package com.killerwhale.patientrecordmanagementsystem.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private Date dateOfBirth;
    private String gender;
    private String countryOfOrigin;
    private String address;
    private String landline;
    private int mobile;
    private String occupation;
    private int children;
    private int partners;
    private String referral;


}
