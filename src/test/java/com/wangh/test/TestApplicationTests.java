package com.wangh.test;

import com.wangh.test.event.WangRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    private WangRunListener wangRunListener;

    @Test
    void contextLoads() {
    }
    @Test
    public void testEvent() {
        wangRunListener.testFirst();
        wangRunListener.testSecond();
    }

}
