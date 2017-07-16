package com.ld1995.repository;

import com.ld1995.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("patientRepository")
public interface IPatientRepository extends JpaRepository<Patient,Long> {

}
