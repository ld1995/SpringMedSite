package com.ld1995.repository;

import com.ld1995.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department,Long> {

}
