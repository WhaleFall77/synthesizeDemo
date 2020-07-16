/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/4 14:39 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.event;

import org.springframework.stereotype.Component;

/**
 *
 * @author wangh
 * @create 2020/3/3
 * @since 1.0.0
 */
@Component
public class MyEventMulticaster extends AbstractEventMulticaster {

    @Override
    void doStart() {
        System.out.println("开始广播");
    }

    @Override
    void doEnd() {
        System.out.println("结束广播");
    }
}
