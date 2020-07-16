/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/4 14:24 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.event;

import org.springframework.stereotype.Component;

/**
 * Description:  <br>
 *
 * @author gss
 * @create 2020/3/4 
 * @since 1.0.0
 */
@Component
public class FirstListener implements WanghListener {


    @Override
    public void onEvent(WanghEvent event) {
        if (event instanceof FirstEvent) {
            System.out.println("hello" + event.getEvent());
        }
    }
}
