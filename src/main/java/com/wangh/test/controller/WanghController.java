/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/2/27 11:02 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.controller;

import com.wangh.test.service.WanghService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gss
 * @create 2020/2/25
 * @since 1.0.0
 */
@Controller
@RequestMapping("/demo")
public class WanghController {

    @Autowired
    private WanghService wanghService;

    @RequestMapping("/initializer")
    @ResponseBody
    public String test() {
        return wanghService.test();
    }


}
