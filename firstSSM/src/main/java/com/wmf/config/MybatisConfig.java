package com.wmf.config;

import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.Configuration;
import org.springframework.beans.factory.InitializingBean;

public class MybatisConfig extends Configuration implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setLogImpl(StdOutImpl.class);
    }
}
