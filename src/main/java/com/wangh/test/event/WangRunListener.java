/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/4 16:39 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author wangh
 * @create 2020/3/2
 * @since 1.0.0
 */
@Component
public class WangRunListener {

    @Autowired
    private EventMulticaster eventMulticaster;


    public void testFirst() {
        eventMulticaster.multicastEvent(new FirstEvent());

    }
    public void testSecond() {
        eventMulticaster.multicastEvent(new SecondEvent());

    }
}
