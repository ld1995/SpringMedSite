package com.ld1995.repository;

import com.ld1995.models.Patient;
import com.ld1995.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("patientRepository")
public interface IPatientRepository extends JpaRepository<Patient,Long> {

//    Optional<Patient> findByPatientName(String name);

}
