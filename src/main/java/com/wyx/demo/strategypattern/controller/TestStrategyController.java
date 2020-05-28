package com.wyx.demo.strategypattern.controller;

import com.wyx.demo.strategypattern.handler.Strategy;
import com.wyx.demo.strategypattern.handler.StrategyContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName TestStrategyController
 * @Description 模拟测试策略模式控制器
 **/
@RestController
@RequestMapping("strategy")
public class TestStrategyController {

    @Resource
    private StrategyContext strategyContext;

    /**
     * 根据不同的code值选则不同的处理模式来处理
     * code为0时选择mp3处理，为1时选择mp4处理，为2时选择mp5处理
    **/
    @GetMapping("test")
    public String testStrategy(@RequestParam(value = "code") Integer code,
                               @RequestParam(value = "param") String param) {
        Strategy strategy = strategyContext.getStrategy(code);
        if (strategy == null) {
            return "不支持的格式";
        }
        return strategy.custom(param);
    }

}
