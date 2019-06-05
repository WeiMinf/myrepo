package com.example.timertask.taskjob;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Component
@Configuration    // 1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling // 2.开启定时任务
public class Job1 {

    // 3.添加定时任务
//    @Scheduled(cron="0/10 * * * * ?")
//    public void job(){
//        System.out.println(new Date() + "静态定时任务");
//    }
}
