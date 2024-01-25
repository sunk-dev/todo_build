package com.study.todoapi.auth;

import com.study.todoapi.user.entity.Role;
import lombok.*;

@Setter @Getter
@ToString()@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
public class TokenUserInfo {
    private String userId;
    private String email;
    private Role role;

}
