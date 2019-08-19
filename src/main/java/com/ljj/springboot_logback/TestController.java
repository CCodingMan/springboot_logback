package com.ljj.springboot_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ljj
 * @Date: 2019/7/18 10:13
 * @Description:
 */
@RestController
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public String index() {
        logger.debug("test测试debug日志");
        logger.info("test访问了index");
        logger.error("test测试error日志");
        return "test";
    }
}
