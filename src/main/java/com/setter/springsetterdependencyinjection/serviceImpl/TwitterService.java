package com.setter.springsetterdependencyinjection.serviceImpl;

import com.setter.springsetterdependencyinjection.service.MessageService;
import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService {
    @Override
    public void sendMsg(String msg) {
        System.out.println(msg);
    }
}
