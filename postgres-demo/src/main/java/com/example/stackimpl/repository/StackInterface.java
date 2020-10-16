package com.example.stackimpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stackimpl.model.StackModel;

@Repository
public interface StackInterface extends JpaRepository<StackModel, Long> {

}
