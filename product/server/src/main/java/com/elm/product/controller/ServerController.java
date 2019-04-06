package com.elm.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供测试服务，供order使用
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg";
    }
}
