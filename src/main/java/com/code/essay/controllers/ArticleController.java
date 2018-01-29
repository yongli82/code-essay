package com.code.essay.controllers;

import com.code.essay.entities.Article;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangyongli
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/list")
    List<Article> listArticles(){
        return Lists.newArrayList();
    }


}
