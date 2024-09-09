package com.loginLogout.loginLogout.controller;

import com.loginLogout.loginLogout.Role;
import com.loginLogout.loginLogout.dto.MemberForm;
import com.loginLogout.loginLogout.entity.Member;
import com.loginLogout.loginLogout.service.MemberService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/account")
public class AccountController {

    private final MemberService memberService;

    @GetMapping("/signup")
    public String signupForm() {
        return "redirect:/signup.html";
    }

    @Transactional
    @PostMapping("/signup")
    public String signup(MemberForm memberForm) {

        Member member = Member.builder()
                .email(memberForm.getEmail())
                .password(memberForm.getPassword())
                .nickname(memberForm.getNickname())
                .role(Role.USER)
                .build();
        memberService.join(member);
        return "redirect:/login.html";
    }
}
