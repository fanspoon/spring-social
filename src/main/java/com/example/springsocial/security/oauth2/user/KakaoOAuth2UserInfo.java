package com.example.springsocial.security.oauth2.user;

import java.util.Map;

public class KakaoOAuth2UserInfo extends OAuth2UserInfo {
    public KakaoOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");

    Map<String, Object> kakaoProperties = (Map<String, Object>) attributes.get("properties");

    @Override
    public String getId() { return String.valueOf( attributes.get("id") ); }

    @Override
    public String getName() { return (String) kakaoProperties.get("nickname"); }

    @Override
    public String getEmail() { return (String) kakaoAccount.get("email"); }

    @Override
    public String getImageUrl() { return (String) kakaoProperties.get("profile_image"); }
}
