package com.demo.walk.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.walk.domain.entity.Walk;

@Repository
public interface WalkRepository extends JpaRepository<Walk, Long> {

}
