package com.spring_tutorials.production_ready_features.repositories;

import com.spring_tutorials.production_ready_features.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PostRepository extends JpaRepository< PostEntity, Long> {
}
