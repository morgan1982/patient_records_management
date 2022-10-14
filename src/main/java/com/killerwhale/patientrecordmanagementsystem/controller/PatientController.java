package com.killerwhale.patientrecordmanagementsystem.controller;

import com.killerwhale.patientrecordmanagementsystem.exception.ResourceNotFoundException;
import com.killerwhale.patientrecordmanagementsystem.model.Patient;
import com.killerwhale.patientrecordmanagementsystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Patient with id: %s does not exist", id)));

        return ResponseEntity.ok(patient);
    }

}
