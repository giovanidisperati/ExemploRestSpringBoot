package com.rest.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
