package com.ll.chatDB.domain.chat.chatMessage.repository;

import com.ll.chatDB.domain.chat.chatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
