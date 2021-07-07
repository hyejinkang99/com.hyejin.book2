package com.hyejin.book2.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter//선언된 모든 필드의 get메소드를 생성해준다.
@RequiredArgsConstructor//선언된 모든 필드가 포함된 생성자를 생성해준다.
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
