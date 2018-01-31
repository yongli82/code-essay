package com.code.essay.controllers;

import com.code.essay.entities.Article;
import com.code.essay.entities.ArticleRelativity;
import com.code.essay.repositories.ArticleRepository;
import com.code.essay.services.ArticleRelativityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author yangyongli
 */
@Controller
public class IndexController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleRelativityService articleRelativityService;

    @GetMapping("/")
    public String index(Model model) {
        List<Article> articles = articleRepository.findAll();
        String currentTime = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        model.addAttribute("currentTime", currentTime);
        model.addAttribute("articles", articles);
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @GetMapping("/a/{id}")
    public String article(@PathVariable("id") Long id, Model model) {
        Article article = articleRepository.findOne(id);
        model.addAttribute("article", article);

        List<ArticleRelativity> articleRelativityList = articleRelativityService.recommendArticles(article);
        model.addAttribute("articleRelativityList", articleRelativityList);

        return "article";
    }
}
