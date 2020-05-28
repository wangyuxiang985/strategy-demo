package com.wyx.demo.strategypattern.handler;

import org.springframework.stereotype.Component;

/**
 * @ClassName Mp4Strategy
 * @Description 如果类型为mp4时需执行的方法
 **/
@Component
@StrategyTypeHandler(TpyeEnum.MP4)
public class Mp4Strategy implements Strategy {
    @Override
    public String custom(String param) {
        System.out.println("我是处理MP4格式的方法");
        //todo 书写自己的业务处理逻辑
        return "MP4:" + param;
    }
}
