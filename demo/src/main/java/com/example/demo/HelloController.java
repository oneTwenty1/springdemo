package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liudashuang on 2018/3/20.
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String test() {
        return "spring";
    }

}
