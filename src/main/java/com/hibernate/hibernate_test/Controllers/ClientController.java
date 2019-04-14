package com.hibernate.hibernate_test.Controllers;

import com.hibernate.hibernate_test.Models.Company;
import com.hibernate.hibernate_test.Services.CompInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private CompInterface compInterface;

    @GetMapping("/")
    public String getMainPage() {
        return "main";
    }

    @PostMapping("/company")
    public void add() {
        compInterface.add(new Company("Endava"));
    }

    @GetMapping("/getAll")
    public List<Company> getAll() {
        return compInterface.getAll();
    }

}
