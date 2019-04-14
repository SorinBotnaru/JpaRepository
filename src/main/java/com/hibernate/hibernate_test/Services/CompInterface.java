package com.hibernate.hibernate_test.Services;

import com.hibernate.hibernate_test.Models.Company;

import java.util.List;

public interface CompInterface {

    void add(Company company);

    List<Company> getAll();

    Company getById(int id);

    void delet(int id);
}
