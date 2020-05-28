package com.wyx.demo.strategypattern.handler;

import org.springframework.stereotype.Component;

/**
 * @ClassName Mp3Strategy
 * @Description 如果类型为mp3时需执行的方法
 **/
@Component
@StrategyTypeHandler(TpyeEnum.MP3)
public class Mp3Strategy implements Strategy {
    @Override
    public String custom(String param) {
        System.out.println("我是处理MP3格式的方法");
        //todo 书写自己的业务处理逻辑
        return "MP3:" + param;
    }
}
