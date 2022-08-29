package com.field.springfielddependencyinjection.component;

import com.field.springfielddependencyinjection.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldBasedInjection {
    @Autowired
    @Qualifier("TwitterService")
    private MessageService messageService;

public void processMsg(String msg) {
    messageService.sendMsg(msg);
}
}
