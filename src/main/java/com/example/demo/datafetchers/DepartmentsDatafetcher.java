package com.example.demo.datafetchers;

import com.example.demo.models.Department;
import com.example.demo.repository.DepartmentRepository;
import com.netflix.graphql.dgs.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class DepartmentsDatafetcher {

    @Autowired
    private DepartmentRepository repository;

    @DgsQuery
    public List<Department> departments() {

        return repository.findAll();
    }

}
