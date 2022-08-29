package com.setter.springsetterdependencyinjection.component;

import com.setter.springsetterdependencyinjection.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterBasedInjection {
    private MessageService messageService;
    @Autowired
    @Qualifier("TwitterService")
    public void setMessageService(MessageService messageService){
        this.messageService=messageService;
    }
    public void processMsg(String msg){
        messageService.sendMsg(msg);
    }
}
