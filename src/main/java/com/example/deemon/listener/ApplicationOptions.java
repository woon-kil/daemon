package com.example.deemon.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ApplicationOptions {
    ApplicationOptions(ApplicationArguments args){
        System.out.println("@@@@ is contained 'foo' : "  + args.containsOption("foo"));
        System.out.println("@@@@ is contained 'bar' : "  + args.containsOption("bar"));
    }
}