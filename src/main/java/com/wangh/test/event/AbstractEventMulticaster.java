/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/4 14:32 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.event;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:  <br>
 *
 * @author gss
 * @create 2020/3/4
 * @since 1.0.0
 */
public abstract class AbstractEventMulticaster implements EventMulticaster {


    @Autowired
    private List<WanghListener> listenerList ;


    @Override
    public void multicastEvent(WanghEvent event) {
        doStart();
        listenerList.forEach(i ->i.onEvent(event));
        doEnd();

    }

    @Override
    public void addListener(WanghListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void removeListener(WanghListener listener) {
        listenerList.remove(listener);
    }

    abstract void doStart();

    abstract void doEnd();


}
