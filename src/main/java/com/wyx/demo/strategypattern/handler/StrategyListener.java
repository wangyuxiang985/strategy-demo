package com.wyx.demo.strategypattern.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName StrategyListener
 * @Description 服务启动后初始化策略容器
 **/
@Component
public class StrategyListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Map<String, Object> beans = event.getApplicationContext().getBeansWithAnnotation(StrategyTypeHandler.class);
        StrategyContext strategyContext = event.getApplicationContext().getBean(StrategyContext.class);
        beans.forEach((name, bean) -> {
            StrategyTypeHandler typeHandler = bean.getClass().getAnnotation(StrategyTypeHandler.class);
            strategyContext.putStrategy(typeHandler.value().getCode(), (Strategy) bean);
        });
    }
}
