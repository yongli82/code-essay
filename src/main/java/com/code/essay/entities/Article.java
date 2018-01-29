package com.code.essay.entities;

import com.code.essay.enums.RecordStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @author yangyongli
 */
@ApiModel(description = "文章")
@Entity
@Table(name = "article")
@Data
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * UUID
     */
    @ApiModelProperty(value = "UUID")
    @Column(name = "uuid")
    private String uuid;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    @Column(name = "title")
    private String title;

    /**
     * 小标题
     */
    @ApiModelProperty(value = "小标题")
    @Column(name = "sub_title")
    private String subTitle;

    /**
     * 作者
     */
    @ApiModelProperty(value = "作者")
    @Column(name = "author_name")
    private String authorName;

    /**
     * 介绍
     */
    @ApiModelProperty(value = "介绍")
    @Column(name = "introduction")
    private String introduction;

    /**
     * 大封面
     */
    @ApiModelProperty(value = "大封面")
    @Column(name = "cover_image_big")
    private String coverImageBig;

    /**
     * 小封面
     */
    @ApiModelProperty(value = "小封面")
    @Column(name = "cover_image_small")
    private String coverImageSmall;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    @Column(name = "content")
    private String content;

    /**
     * 发布时间
     */
    @ApiModelProperty(value = "发布时间")
    @Column(name = "publish_time")
    private ZonedDateTime publishTime;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    @Column(name = "memo")
    private String memo;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    @Enumerated(EnumType.STRING)
    @Column(name = "record_status")
    private RecordStatus recordStatus = RecordStatus.VALID;
}
