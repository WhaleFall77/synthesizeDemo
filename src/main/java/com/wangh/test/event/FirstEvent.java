/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/4 14:22 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.event;

import com.wangh.test.service.WanghService;
import org.springframework.stereotype.Component;

/**
 *
 * @author wangh
 * @create 2020/3/4 
 * @since 1.0.0
 */
@Component
public class FirstEvent extends WanghEvent {

    @Override
    public String getEvent() {
        return "im firstEvent";
    }


}
