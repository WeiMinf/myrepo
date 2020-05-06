package com.wmf.config;

import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.Configuration;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MybatisConfig extends Configuration /*implements InitializingBean, DisposableBean*/ {

/*    @Override
    public void afterPropertiesSet() throws Exception {
        this.setLogImpl(StdOutImpl.class);
    }

    @Override
    public void destroy() throws Exception {

    }*/

    //
    // 希望在 Bean 初始化完成之后执行一些自定义操作
    // 推荐指定方法,在 XML 文件中使用 <bean> 的 init-method 和 destroy-method 属性指定初始化之后和销毁之前的回调方法
    // 不推荐使用 实现InitializingBean和 DisposableBean接口的方式，InitializingBean和 DisposableBean是Spring框架提供的，
    // 让 Bean 类实现Spring 提供的接口，增加了代码与 Spring 框架的耦合度
    public void afterInit(){
        this.setLogImpl(StdOutImpl.class);
    }
}
