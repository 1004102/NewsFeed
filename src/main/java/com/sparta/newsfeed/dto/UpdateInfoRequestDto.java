package com.sparta.newsfeed.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateInfoRequestDto {
    String username;
    String password;
    String introduce;
}