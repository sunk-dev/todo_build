package com.study.todoapi.user.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.study.todoapi.user.entity.User;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDTO {
    private String emaill;
    String userName;
    @JsonFormat(pattern = "yyyy년 MM월 dd일")
    private LocalDate joinDate;

    private String token;

    public  LoginResponseDTO(User user,String token){
        this.emaill=user.getEmail();
        this.userName=user.getUserName();
        this.joinDate=LocalDate.from(user.getJoinDate());
        this.token=token;
    }
}
