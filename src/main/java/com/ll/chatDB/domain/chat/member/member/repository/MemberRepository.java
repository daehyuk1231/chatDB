package com.ll.chatDB.domain.chat.member.member.repository;

import com.ll.chatDB.domain.chat.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
