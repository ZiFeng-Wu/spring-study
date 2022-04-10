package com.zifeng.spring.listener;

import com.zifeng.spring.event.EventDemo;
import com.zifeng.spring.service.DemoService1;
import com.zifeng.spring.service.DemoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 吴梓锋
 * @version 1.0.0
 * @date 2022/04/02 16:10:54
 * @description
 */
@Component
public class EventDemoListener implements ApplicationListener<EventDemo> {
    @Autowired
    DemoService1 demoService1;
    @Autowired
    DemoService2 demoService2;
    @Autowired
    EventDemoListener eventDemoListener;

    @Override
    public void onApplicationEvent(EventDemo event) {
        eventDemoListener.testTransaction();
        System.out.println("receiver " + event.getMessage());
    }

    @Transactional(rollbackFor = Exception.class)
    public void testTransaction() {
        demoService1.doService();
        demoService2.doService();
    }

}
