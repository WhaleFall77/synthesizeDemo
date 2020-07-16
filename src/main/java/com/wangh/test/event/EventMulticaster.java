package com.wangh.test.event;

/**
 * 事件广播器
 *
 * @Auther: wangh
 * @Date: 2020/3/3 23:27
 * @Description:
 */
public interface EventMulticaster {

    void multicastEvent(WanghEvent event);

    void addListener(WanghListener listener);

    void removeListener(WanghListener listener);





}
