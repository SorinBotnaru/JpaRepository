package com.hibernate.hibernate_test.DAO;

import com.hibernate.hibernate_test.Models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompRep extends JpaRepository<Company, Integer> {
}
