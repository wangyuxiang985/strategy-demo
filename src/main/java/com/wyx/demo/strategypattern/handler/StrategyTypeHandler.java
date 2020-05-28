package com.wyx.demo.strategypattern.handler;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StrategyTypeHandler {
    TpyeEnum value();
}
