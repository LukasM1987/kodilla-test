package com.kodilla.kodilla.hibernate.manytomany.facade;

import ch.qos.logback.classic.Logger;
import com.kodilla.kodilla.hibernate.manytomany.Company;
import com.kodilla.kodilla.hibernate.manytomany.Employee;
import com.kodilla.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyAndEmployeeFacade {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(CompanyAndEmployeeFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public void companyFacade(final String fragment) throws FacadeException {
        boolean wasError = false;
        LOGGER.info("Searching company by name fragment: " + fragment);
        List<Company> companies = companyDao.findCompanyByFragment("%"  + fragment + "%");
        if (companies.size() == 0) {
            LOGGER.error(FacadeException.ERR_NO_COMPANY);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_COMPANY);
        } else {
            LOGGER.info("Company is existing in database.");
            for (Company item : companies) {
                System.out.println("Company: " + item.getName());
            }
        }
    }

    public void employeeFacade(final String fragment) throws FacadeException {
        boolean wasError = false;
        LOGGER.info("Searching employee by name fragment: " + fragment);
        List<Employee> employees = employeeDao.findEmployeeByFragment( "%" + fragment + "%");
        if (employees.size() == 0) {
            LOGGER.error(FacadeException.ERR_NO_EMPLOYEE);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_NO_EMPLOYEE);
        } else {
            LOGGER.info("Employee is existing in database.");
            for (Employee item : employees) {
                System.out.println("Employee: " + item.getFirstname() + " " + item.getLastname());
            }
        }
    }
}
