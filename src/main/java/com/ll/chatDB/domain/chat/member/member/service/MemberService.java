package com.ll.chatDB.domain.chat.member.member.service;

import com.ll.chatDB.domain.chat.member.member.entity.Member;
import com.ll.chatDB.domain.chat.member.member.repository.MemberRepository;
import com.ll.chatDB.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public RsData<Member> join(String username, String password) {
        Member member = Member.builder()
                .username(username)
                .password(password)
                .build();

        memberRepository.save(member);

        return RsData.of("200", "%s 님 가입을 환영합니다.".formatted(username),  member);
    }
}
