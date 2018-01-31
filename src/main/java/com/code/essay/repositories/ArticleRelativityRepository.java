package com.code.essay.repositories;

import com.code.essay.entities.ArticleRelativity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yangyongli
 */
@Repository
public interface ArticleRelativityRepository extends JpaRepository<ArticleRelativity, Long> {
}
