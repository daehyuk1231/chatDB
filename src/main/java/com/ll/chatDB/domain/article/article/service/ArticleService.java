package com.ll.chatDB.domain.article.article.service;

import com.ll.chatDB.domain.article.article.entity.Article;
import com.ll.chatDB.domain.article.article.repository.ArticleRepository;
import com.ll.chatDB.domain.article.articleComment.entity.ArticleComment;
import com.ll.chatDB.domain.member.member.entity.Member;
import com.ll.chatDB.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional
    public RsData<Article> write(Long memberId, String title, String content) {
        Article article = Article.builder()
                .author(Member.builder().id(memberId).build())
                .title(title)
                .content(content)
                .build();

        articleRepository.save(article);

        return RsData.of("200", "글 작성 성공", article);
    }

    public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }

    @Transactional
    public void modify(Article article, String title, String content) {
        article.setTitle(title);
        article.setContent(content);

//        articleRepository.save(article);
    }

    @Transactional
    public void modifyComment(ArticleComment comment, String commentBody) {
        comment.setBody(commentBody);
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}