package com.artistack.jwt.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtDto {

    private String grantType;
    private String accessToken;
    private String refreshToken;
    private Long accessTokenExpiresIn;
}
