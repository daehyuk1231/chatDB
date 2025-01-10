package com.ll.chatDB.domain.article.article.dto;

import lombok.Data;

@Data
public class ArticleWriteRequest {
    private String title;
    private String content;
}