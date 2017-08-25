package com.ld1995.services;

import com.ld1995.models.Department;
import com.ld1995.models.Patient;
import com.ld1995.models.User;

import java.util.List;

public interface IDepartmentServices {

    public List<Department> getDepartmentList();

    public Department getDepartmentById(long id);

    public void deleteDepartment(Department department);

    public void deleteDepartmentById(long id);

    public Department save(Department department);

    public List<User> getListOfUsersInTheDepartment(long id);

    public List<Patient> getListOfPatientsInTheDepartment(long id);


}
