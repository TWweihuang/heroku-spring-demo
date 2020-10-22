package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.exception.CompanyNotFoundException;
import com.thoughtworks.springbootemployee.model.Company;
import com.thoughtworks.springbootemployee.model.Employee;
import com.thoughtworks.springbootemployee.repository.CompanyRepositoryLegacy;
import com.thoughtworks.springbootemployee.repository.EmployeeRepositoryLegacy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepositoryLegacy companyRepository;
    private final EmployeeRepositoryLegacy employeeRepository;

    public CompanyService(CompanyRepositoryLegacy companyRepository,
                          EmployeeRepositoryLegacy employeeRepository) {
        this.companyRepository = companyRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    public Page<Company> getAll(Integer page, Integer pageSize) {
        return companyRepository.findAll(PageRequest.of(page, pageSize));
    }

    public Company get(Integer companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    public Company create(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(Integer companyId) {
        Optional<Company> company = companyRepository.findById(companyId);
        company.ifPresent(companyRepository::delete);
    }

    public Company update(Integer companyId, Company updatingCompany) {
        Company company = companyRepository.findById(companyId).orElse(null);
        if (company != null) {
            if (updatingCompany.getCompanyName() != null) {
                company.setCompanyName(updatingCompany.getCompanyName());
            }
            return company;
        }
        throw new CompanyNotFoundException("Company Id Not Found.");
    }

    public List<Employee> getEmployees(Integer companyId) {
        return companyRepository
                .findById(companyId)
                .map(Company::getEmployees).orElse(null);
    }
}
