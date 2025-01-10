package com.ll.chatDB.domain.member.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ll.chatDB.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Member extends BaseEntity {
    @Column(unique = true)
    String username;
    @JsonIgnore
    String password;
}