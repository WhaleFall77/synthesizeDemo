/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/4 14:40 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.event;

/**
 *
 * @author wangh
 * @create 2020/3/4 
 * @since 1.0.0
 */
public class EventTest {


    public static void main(String[] args) {
        MyEventMulticaster myEventMulticaster = new MyEventMulticaster();
        FirstListener first = new FirstListener();
        SecondListener second = new SecondListener();
        myEventMulticaster.addListener(first);
        myEventMulticaster.addListener(second);
        myEventMulticaster.multicastEvent(new FirstEvent());
        myEventMulticaster.multicastEvent(new SecondEvent());
        myEventMulticaster.removeListener(second);
        myEventMulticaster.multicastEvent(new FirstEvent());
        myEventMulticaster.multicastEvent(new SecondEvent());


    }

}
