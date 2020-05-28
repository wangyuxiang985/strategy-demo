package com.wyx.demo.strategypattern.handler;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StrategyContext
 * @Description 策略容器
 **/
@Component
public class StrategyContext {
    private final Map<Integer, Strategy> handlerMap = new HashMap<>();

    public Strategy getStrategy(Integer type) {
        return handlerMap.get(type);
    }

    public void putStrategy(Integer code, Strategy strategy) {
        handlerMap.put(code, strategy);
    }
}
