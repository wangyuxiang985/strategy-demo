package com.wyx.demo.strategypattern.handler;

import org.springframework.stereotype.Component;

/**
 * @ClassName Mp5Strategy
 * @Description 如果类型为mp5时需执行的方法
 **/
@Component
@StrategyTypeHandler(TypeEnum.MP5)
public class Mp5Strategy implements Strategy {
    @Override
    public String custom(String param) {
        System.out.println("我是处理MP5格式的方法");
        //todo 书写自己的业务处理逻辑
        return "MP5:" + param;
    }
}
