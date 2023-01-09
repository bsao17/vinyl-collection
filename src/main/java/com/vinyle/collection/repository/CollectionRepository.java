package com.vinyle.collection.repository;

import com.vinyle.collection.model.CollectionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepository extends JpaRepository<CollectionModel, Integer> {
}
