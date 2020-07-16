/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/2/27 11:05 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 *
 * @author wangh
 * @create 2020/2/25
 * @since 1.0.0
 */
@Service
public class WanghService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 返回上下文当中的环境变量
     * @return
     */
    public String test() {
        return applicationContext.getEnvironment().getProperty("key1");
    }

}
