package com.loginLogout.loginLogout.service;

import com.loginLogout.loginLogout.entity.Member;
import com.loginLogout.loginLogout.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public String join(Member member) {
        memberRepository.save(member);
        return member.getEmail();
    }
}
