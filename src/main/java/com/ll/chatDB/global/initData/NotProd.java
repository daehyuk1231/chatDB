package com.ll.chatDB.global.initData;

import com.ll.chatDB.domain.article.article.entity.Article;
import com.ll.chatDB.domain.article.article.service.ArticleService;
import com.ll.chatDB.domain.chat.chatMessage.service.ChatMessageService;
import com.ll.chatDB.domain.chat.chatRoom.service.ChatRoomService;
import com.ll.chatDB.domain.member.member.entity.Member;
import com.ll.chatDB.domain.member.member.service.MemberService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!prod")
public class NotProd {
    @Bean
    public ApplicationRunner applicationRunner(
            ChatRoomService chatRoomService,
            ChatMessageService chatMessageService,
            MemberService memberService,
            ArticleService articleService
    ) {
        return args -> {
//            ChatRoom chatRoom1 = chatRoomService.create("room1");
//            ChatRoom chatRoom2 = chatRoomService.create("room2");
//            ChatRoom chatRoom3 = chatRoomService.create("room3");
//
//            IntStream.rangeClosed(1, 100).forEach(num -> {
//                chatMessageService.create(chatRoom1, "홍길동", "채팅메세지" + num);
//            });
            Member member1 = memberService.join("user1", "1234").getData();
//            Member member2 = memberService.join("user2", "1234").getData();
//            Member member3 = memberService.join("user3", "1234").getData();

            Article article1 = articleService.write(member1.getId(), "제목1", "내용1").getData();
//            Article article2 = articleService.write(member1.getId(), "제목2", "내용2").getData();
//
//            Article article3 = articleService.write(member2.getId(), "제목3", "내용3").getData();
//            Article article4 = articleService.write(member2.getId(), "제목4", "내용4").getData();
        };
    }
}