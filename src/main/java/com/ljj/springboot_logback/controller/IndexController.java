package com.ljj.springboot_logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljj
 * @Date: 2019/7/18 09:56
 * @Description:
 */
@RestController
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/index")
    public String index() {
        logger.debug("测试debug日志");
        logger.info("访问了index");
        logger.error("测试error日志");
        return "index";
    }
}
