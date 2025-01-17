package com.ll.chatDB.domain.chat.chatMessage.service;

import com.ll.chatDB.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.chatDB.domain.chat.chatMessage.repository.ChatMessageRepository;
import com.ll.chatDB.domain.chat.chatRoom.entity.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public void create(ChatRoom chatRoom, String writerName, String content) {
        ChatMessage chatMessage = ChatMessage.builder()
                .chatRoom(chatRoom)
                .writerName(writerName)
                .content(content)
                .build();

        chatMessageRepository.save(chatMessage);
    }
}