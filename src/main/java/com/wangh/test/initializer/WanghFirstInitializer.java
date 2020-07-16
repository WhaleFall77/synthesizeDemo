/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/2/27 10:54 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.initializer;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

/**
 * 王浩类初始化器demo <br> 方式一 通过spring.factories
 *
 * @author wangh
 * @create 2020/2/25
 * @since 1.0.0
 */
@Order(1)
public class WanghFirstInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    /**
     * 在spring-boot初始化时，将自定义的属性/环境变量注册到容器中
     * @param applicationContext 上下文
     */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //设置了一个必备的属性
        environment.setRequiredProperties("name");

        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        MapPropertySource initializer = new MapPropertySource("wanghFirstInitializer", map);
        environment.getPropertySources().addLast(initializer);
        System.out.println("run wanghFirstInitializer");

    }
}
