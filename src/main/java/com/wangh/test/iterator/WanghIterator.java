/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/3/19 20:02 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.iterator;

import java.util.Iterator;

/**
 * Description:  <br>
 *
 * @author gss
 * @create 2020/3/18
 * @since 1.0.0
 */
public class WanghIterator implements Iterator<String> {

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public String next() {
        return "nihao";
    }
}
