package com.ll.chatDB.global.initData;

import com.ll.chatDB.domain.chat.chatMessage.service.ChatMessageService;
import com.ll.chatDB.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chatDB.domain.chat.chatRoom.service.ChatRoomService;
import com.ll.chatDB.domain.chat.member.member.entity.Member;
import com.ll.chatDB.domain.chat.member.member.service.MemberService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;

@Configuration
@Profile("!prod")
public class NotProd {
    @Bean
    public ApplicationRunner applicationRunner(ChatRoomService chatRoomService, ChatMessageService chatMessageService, MemberService memberService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.create("room1");
            ChatRoom chatRoom2 = chatRoomService.create("room2");
            ChatRoom chatRoom3 = chatRoomService.create("room3");

            IntStream.rangeClosed(1, 100).forEach(num -> {
                chatMessageService.create(chatRoom1, "홍길동", "채팅메세지" + num);
            });
            Member member1 = memberService.join("user1", "1234").getData();
            Member member2 = memberService.join("user2", "1234").getData();
            Member member3 = memberService.join("user3", "1234").getData();
            System.out.println("This is not a production environment.");
        };
    }
}