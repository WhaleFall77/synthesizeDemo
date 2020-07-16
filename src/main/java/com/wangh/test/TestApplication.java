package com.wangh.test;

import com.wangh.test.initializer.WanghSecondInitializer;
import com.wangh.test.iterator.WanghIterator;
import com.wangh.test.spi.WanghSpi;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.ServiceLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@SpringBootApplication
public class TestApplication {

    private ApplicationContext applicationContext;

    public static void main(String[] args) throws IOException {
//        ClassLoader loader = ClassLoader.getSystemClassLoader();
//        Enumeration<URL> urls = loader.getResources("META-INF/spring.factories");
//        while (urls.hasMoreElements()) {
//            URL url = (URL) urls.nextElement();
//            String path = url.getPath();
//            System.out.println(path);
//        }

        SpringApplication.run(TestApplication.class, args);
//        手动添加自定义的类初始化器
//        SpringApplication springApplication = new SpringApplication(TestApplication.class);
//        springApplication.addInitializers(new WanghSecondInitializer());
//        springApplication.run(args);


        ServiceLoader<WanghSpi> serviceLoader = ServiceLoader.load(WanghSpi.class);
        // 执行不同厂商的业务实现，具体根据业务需求配置
        for (WanghSpi helloSPI : serviceLoader) {
            helloSPI.sayHello();
        }

    }



}
