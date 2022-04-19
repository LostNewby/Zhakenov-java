package com.spring.javasp3.repository;

import com.spring.javasp3.dto.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer, Long> {
    public Costumer findCostumerById(Long id);
}
