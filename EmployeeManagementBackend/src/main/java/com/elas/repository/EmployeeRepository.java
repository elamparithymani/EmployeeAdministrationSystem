package com.elas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elas.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
