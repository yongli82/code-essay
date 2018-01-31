package com.code.essay.repositories;

import com.code.essay.CodeEssayApplication;
import com.code.essay.entities.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author yangyongli
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CodeEssayApplication.class)
@Transactional
public class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void testFindAll(){
        List<Article> articles = articleRepository.findAll();
        System.out.println(articles);
    }

}