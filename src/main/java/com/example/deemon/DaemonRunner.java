package com.example.deemon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class DaemonRunner implements CommandLineRunner {
    @Override
    public void run(String[] args) throws Exception {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                try {
                    log.trace("Daemon thread ..... live");
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    log.error("Daemon Thread Error = {} ", e.getMessage());
                    break;
                }
            }
        });
        // spring boot 의존성에서 web 제거후
        // Thread 를 시작하여 daemon 으로 사용.
        daemonThread.start();
    }
}