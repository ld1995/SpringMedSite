package com.ld1995.repository;

import com.ld1995.modul.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient,Long> {
}
