package com.example.timertask.taskjob;

import com.example.timertask.Mapper.CronMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

@Component
@Configuration
@EnableScheduling
public class Job2 implements SchedulingConfigurer {
    @Autowired
    private CronMapper cronMapper;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//        scheduledTaskRegistrar.addTriggerTask(
//                () -> System.out.println("执行动态定时任务: " + LocalDateTime.now().toLocalTime()),
//                triggerContext -> {
//                    String cron = cronMapper.getCron();
//                    if (StringUtils.isEmpty(cron)) {
//
//                    }
//                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
//                }
//        );
    }
}
