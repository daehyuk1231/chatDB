package com.ll.chatDB.domain.member.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class ApiV1MemberController {
    @PostMapping("/join")
    public void join() {
        System.out.println("join");
    }

    @PostMapping("/login")
    public void login() {
        System.out.println("login");
    }

    @GetMapping("/logout")
    public void logout() {
        System.out.println("logout");
    }

    @GetMapping("/me")
    public void me() {
        System.out.println("me");
    }
}
