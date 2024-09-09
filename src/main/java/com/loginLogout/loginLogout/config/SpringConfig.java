package com.loginLogout.loginLogout.config;

import com.loginLogout.loginLogout.repository.JpaMemberRepository;
import com.loginLogout.loginLogout.repository.MemberRepository;
import com.loginLogout.loginLogout.service.MemberService;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SpringConfig {

    private final EntityManager em;

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}
