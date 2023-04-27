package com.employee.mngt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.employee.mngt.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
