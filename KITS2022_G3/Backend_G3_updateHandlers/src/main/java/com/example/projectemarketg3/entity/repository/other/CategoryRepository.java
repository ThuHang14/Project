package com.example.projectemarketg3.entity.repository.other;

import com.example.projectemarketg3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryRepository extends JpaRepository<Category, Long> {


}