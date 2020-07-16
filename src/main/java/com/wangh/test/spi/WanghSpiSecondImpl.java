/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/19 19:22 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.spi;

/**
 * Description:  <br>
 *
 * @author wangh
 * @create 2020/3/17
 * @since 1.0.0
 */
public class WanghSpiSecondImpl implements WanghSpi{


    @Override
    public void sayHello() {
        System.out.println("Hello second ");
    }
}
