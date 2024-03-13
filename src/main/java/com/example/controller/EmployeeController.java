package com.example.controller;

import com.example.entities.Employee;
import com.example.repository.IEmplyee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    private static IEmplyee _iemployee;

    @GetMapping("/product/getall")
    public List<Employee> getAll(){
        try {
            return _iemployee.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }




}

/*
*  try {

        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
* */
