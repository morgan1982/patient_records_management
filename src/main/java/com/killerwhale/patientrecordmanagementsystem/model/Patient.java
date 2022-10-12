package com.killerwhale.patientrecordmanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Patient {

    @Id
    private int id;
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
