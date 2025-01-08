package com.ll.chatDB.domain.member.member.service;

import com.ll.chatDB.domain.member.member.entity.Member;
import com.ll.chatDB.domain.member.member.repository.MemberRepository;
import com.ll.chatDB.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<Member> findById(long id) {
        return memberRepository.findById(id);
    }
}
