package com.feng.springboot.ai;

import com.feng.springboot.ai.model.HtmlCodeResult;
import com.feng.springboot.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult s = aiCodeGeneratorService.generateHtmlCode("做一个程序员的博客网站, 代码不超过100行");
        Assertions.assertNotNull(s);
    }

    @Test
    void generateMultiFileCode() {
        HtmlCodeResult s = aiCodeGeneratorService.generateHtmlCode("做一个程序员的留言板, 代码不超过100行");
        Assertions.assertNotNull(s);
    }
}