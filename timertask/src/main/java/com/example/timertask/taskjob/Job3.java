package com.example.timertask.taskjob;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableScheduling // 1、开启定时任务
@EnableAsync // 2、开启多线程
public class Job3 {

    @Async
    @Scheduled(fixedDelay = 3000) // 间隔3秒
    public void first() throws InterruptedException {
        System.out.println("第一个定时任务: " + LocalDateTime.now().toLocalTime() + "\r\n线程："+ Thread.currentThread().getName());
        System.out.println();
        Thread.sleep(1000*10);
        System.out.println("第一个定时任务结束: " + LocalDateTime.now().toLocalTime() + "\r\n线程："+ Thread.currentThread().getName());
        System.out.println();
    }

//    @Async
//    @Scheduled(fixedDelay=5000)
//    public void second() {
//        System.out.println("第二个定时任务: " + LocalDateTime.now().toLocalTime()+ "\r\n线程：" + Thread.currentThread().getName());
//        System.out.println();
//    }
}
