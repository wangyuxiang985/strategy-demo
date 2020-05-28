package com.wyx.demo.strategypattern.handler;


/**
 * 策略接口
**/
public interface Strategy {

    /**
     * 每个策略执行的方法
     **/
    String custom(String param);
}
