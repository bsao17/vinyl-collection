package com.vinyle.collection.repository;

import com.vinyle.collection.model.VinylModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinylRepository extends JpaRepository<VinylModel, Integer> {
}

