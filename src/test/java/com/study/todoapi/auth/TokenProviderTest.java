package com.study.todoapi.auth;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.SecureRandom;
import java.util.Base64;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class TokenProviderTest {
    @Test
    @DisplayName("토큰 서명에 필요한 비밀해시값 생성")
    void makeSecretKey() {
        //given
        SecureRandom secureRandom = new SecureRandom();
        //512bit=64byte
        byte[]key=new byte[64];
        secureRandom.nextBytes(key
        );
        String encoded= Base64.getEncoder().encodeToString(key);
        //when
        System.out.println("\n\n\n");
        System.out.println("encoded = " + encoded);
        System.out.println("\n\n\n");
        //then
    }

}