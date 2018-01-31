package com.code.essay.entities;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yangyongli
 */
@ApiModel(description = "文章相关性")
@Entity
@Table(name = "article_relativity")
@Data
public class ArticleRelativity implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name="article_1")
    @ManyToOne
    private Article article1;

    @JoinColumn(name="article_2")
    @ManyToOne
    private Article article2;

    private Long coefficient;
}
