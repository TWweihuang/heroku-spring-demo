package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.exception.EmployeeNotFoundException;
import com.thoughtworks.springbootemployee.model.Employee;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    public static final String EMPLOYEE_NOT_FOUND = "Employee Not Found.";
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Page<Employee> getAll(Integer page, Integer pageSize) {
        return employeeRepository.findAll(PageRequest.of(page, pageSize));
    }

    public Employee get(Integer employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public Employee create(Employee employeeRequest) {
        return employeeRepository.save(employeeRequest);
    }

    public void delete(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public Employee update(Integer employeeId, Employee updatingEmployee) {
        try {
            updatingEmployee.setId(employeeId);
            return employeeRepository.updateIfExist(updatingEmployee);
        } catch (Exception e) {
            throw new EmployeeNotFoundException(EMPLOYEE_NOT_FOUND);
        }
    }

    public List<Employee> getByGender(String gender) {
        return employeeRepository.findByGender(gender);
    }
}
