package com.loginLogout.loginLogout.dto;

import com.loginLogout.loginLogout.Role;
import lombok.Data;

@Data
public class MemberForm {

    private String email;
    private String password;
    private String nickname;
    private Role role;
}
