package com.vinyle.collection.repository;

import com.vinyle.collection.model.VinyleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VinyleRepository extends JpaRepository<VinyleModel, Integer> {
}

