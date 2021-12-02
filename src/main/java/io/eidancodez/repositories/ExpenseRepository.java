package io.eidancodez.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.eidancodez.models.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{
    
}
