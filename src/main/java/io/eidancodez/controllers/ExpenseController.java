package io.eidancodez.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.eidancodez.models.Expense;
import io.eidancodez.repositories.ExpenseRepository;

@RestController
@RequestMapping("/v2/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping
    public Object getAll(){
        return expenseRepository.findAll();
    }

    @PostMapping
    public Object save(@RequestBody Expense expense){
        return expenseRepository.save(expense);
    }

    
}
