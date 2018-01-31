package com.code.essay.services;

import com.code.essay.entities.Article;
import com.code.essay.entities.ArticleRelativity;
import com.code.essay.repositories.ArticleRelativityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangyongli
 */
@Service
public class ArticleRelativityService {

    private final static int RECOMMEND_COUNT = 3;

    @Autowired
    private ArticleRelativityRepository articleRelativityRepository;

    public List<ArticleRelativity> recommendArticles(Article targetArticle) {
        ArticleRelativity prob = new ArticleRelativity();
        prob.setArticle1(targetArticle);
        List<ArticleRelativity> articleRelativityList = articleRelativityRepository.findAll(Example.of(prob), new Sort(Sort.Direction.DESC, "coefficient"));

        return articleRelativityList;
    }

}
