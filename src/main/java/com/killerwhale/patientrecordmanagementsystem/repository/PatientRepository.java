package com.killerwhale.patientrecordmanagementsystem.repository;

import com.killerwhale.patientrecordmanagementsystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // all crud database methods
}
