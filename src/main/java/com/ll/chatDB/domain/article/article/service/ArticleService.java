package com.ll.chatDB.domain.article.article.service;

import com.ll.chatDB.domain.article.article.entity.Article;
import com.ll.chatDB.domain.article.article.repository.ArticleRepository;
import com.ll.chatDB.domain.member.member.entity.Member;
import com.ll.chatDB.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public RsData<Article> write(Long memberId, String title, String content) {
        Article article = Article.builder()
                .member(Member.builder().id(memberId).build())
                .title(title)
                .content(content)
                .build();

        articleRepository.save(article);

        return RsData.of("200", "%d번 게시글이 작성되었습니다.".formatted(article.getId()), article);
    }

}
