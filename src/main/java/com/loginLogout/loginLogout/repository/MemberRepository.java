package com.loginLogout.loginLogout.repository;

import com.loginLogout.loginLogout.entity.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    public Member save(Member member);
}
