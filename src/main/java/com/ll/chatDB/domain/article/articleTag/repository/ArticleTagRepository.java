package com.ll.chatDB.domain.article.articleTag.repository;

import com.ll.chatDB.domain.article.articleTag.entity.ArticleTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleTagRepository extends JpaRepository<ArticleTag, Long> {
    List<ArticleTag> findByArticle_authorId(long authorId);

    List<ArticleTag> findByArticle_authorUsername(String authorUsername);
}
