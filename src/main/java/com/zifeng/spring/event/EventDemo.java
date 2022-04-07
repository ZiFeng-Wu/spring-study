package com.zifeng.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 吴梓锋
 * @version 1.0.0
 * @date 2022/04/02 16:10:25
 * @description
 */
public class EventDemo extends ApplicationEvent {
    private String message;

    public EventDemo(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
