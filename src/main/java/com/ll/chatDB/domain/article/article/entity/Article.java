package com.ll.chatDB.domain.article.article.entity;

import com.ll.chatDB.domain.article.articleComment.entity.ArticleComment;
import com.ll.chatDB.domain.member.member.entity.Member;
import com.ll.chatDB.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.transaction.Transactional;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Article extends BaseEntity {
    private String title;
    private String content;
    @ManyToOne
    private Member author;
    
    @OneToMany(mappedBy = "article", cascade = ALL)
    @Builder.Default
    @ToString.Exclude
    private List<ArticleComment> comments = new ArrayList<>();

    @Transactional
    public void addComment(Member memberAuthor, String commentBody) {
        ArticleComment articleComment = ArticleComment.builder()
                .article(this)
                .author(memberAuthor)
                .body(commentBody)
                .build();
        comments.add(articleComment);
    }

    public void removeComment(ArticleComment comment) {
        comments.remove(comment);
    }
}