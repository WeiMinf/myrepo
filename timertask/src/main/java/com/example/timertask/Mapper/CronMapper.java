package com.example.timertask.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface CronMapper {

    @Select("select cron from cron_expression limit 1")
    public String getCron();
}
