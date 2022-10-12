package com.killerwhale.patientrecordmanagementsystem.util;

import com.killerwhale.patientrecordmanagementsystem.model.Patient;
import com.killerwhale.patientrecordmanagementsystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Datasource {

    @Autowired
    private PatientRepository patientRepository;

    public void populatePatients() throws Exception {
        Patient patient = new Patient(1, "mike", "jacobs", 32,
                LocalDate.parse("1990-08-01"), "male", "Greece", "vol 34",
                "atica",  "435345", "engineer", 2, 1, "net");
        patientRepository.save(patient);

        Patient patient2 = new Patient(2, "jhon", "salore", 35,
                LocalDate.parse("1986-08-01"), "male", "Usa", "voh 3",
                "atica",  "435345", "engineer", 2, 1, "net");
        patientRepository.save(patient2);

        Patient patient3 = new Patient(3, "mike", "jacobs", 32,
                LocalDate.parse("1990-08-01"), "male", "Greece", "vol 34",
                "atica",  "435345", "engineer", 2, 1, "net");
        patientRepository.save(patient3);

        Patient patient4 = new Patient(4, "mike", "jacobs", 32,
                LocalDate.parse("1990-08-01"), "male", "Greece", "vol 34",
                "atica",  "435345", "engineer", 2, 1, "net");
        patientRepository.save(patient4);

        Patient patient5 = new Patient(5, "mike", "jacobs", 32,
                LocalDate.parse("1990-08-01"), "male", "Greece", "vol 34",
                "atica",  "435345", "engineer", 2, 1, "net");
        patientRepository.save(patient5);
    }

}
