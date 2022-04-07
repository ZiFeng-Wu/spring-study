package com.zifeng.spring.service;

import com.zifeng.spring.event.EventDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author 吴梓锋
 * @version 1.0.0
 * @date 2022/04/02 16:16:21
 * @description
 */
@Component
public class EventDemoService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publicEventDemo() {
        String message = "test";
        EventDemo demo = new EventDemo(this, message);
        applicationEventPublisher.publishEvent(demo);
    }

}
