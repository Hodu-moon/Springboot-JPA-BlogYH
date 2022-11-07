package com.cos.blogyh.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController // com.cos.blog 패키지 이하를 스캔해서 // 특정어노테션
public class BlogControllerTest {
    @GetMapping("test/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";
    }
}
