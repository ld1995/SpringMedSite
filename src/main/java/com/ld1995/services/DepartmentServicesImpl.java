package com.ld1995.services;

import com.ld1995.models.Department;
import com.ld1995.models.Patient;
import com.ld1995.models.User;
import com.ld1995.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentServices")
public class DepartmentServicesImpl implements IDepartmentServices {

    @Autowired
    IDepartmentRepository departmentRepository;

    @Override
    public List<Department> getDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(long id) {
        return departmentRepository.getOne(id);
    }

    @Override
    public void deleteDepartment(Department department) {
        departmentRepository.delete(department);
    }

    @Override
    public void deleteDepartmentById(long id) {
        departmentRepository.delete(id);
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<User> getListOfUsersInTheDepartment(long id) {
        return getDepartmentById(id).getUser();
    }

    @Override
    public List<Patient> getListOfPatientsInTheDepartment(long id) {
        return getDepartmentById(id).getPatients();
    }
}
