package com.josueao.celeirocatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josueao.celeirocatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
