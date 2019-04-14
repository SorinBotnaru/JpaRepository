package com.hibernate.hibernate_test.Services;

import com.hibernate.hibernate_test.DAO.CompRep;
import com.hibernate.hibernate_test.Models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyImpl implements CompInterface {

    @Autowired
    CompRep compRep;

    @Override
    public void add(Company company) {
        compRep.save(new Company("Endava"));
    }

    @Override
    public List<Company> getAll() {
        return compRep.findAll();
    }

    @Override
    public Company getById(int id) {
        return null;
    }

    @Override
    public void delet(int id) {

    }
}
