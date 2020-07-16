/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/4/8 17:29 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.rabbitMQ;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;

/**
 * 连接工具类
 *
 * @author wangh
 * @create 2020/4/8
 * @since 1.0.0
 */
public class ConnectionUtil {

    /**
     * rabbitmq内虚拟机
     */
    private static final String V_HOST = "/src";

    private static final String USER_NAME = "wangh";

    private static final String PASSWORD = "wang12345";


    public static Connection getConnection() throws IOException {
        //连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        //连接5672端口  注意15672为工具界面端口  25672为集群端口
        factory.setPort(5672);
        factory.setVirtualHost(V_HOST);
        factory.setUsername(USER_NAME);
        factory.setPassword(PASSWORD);
        //创建与RabbitMQ服务的TCP连接
        Connection connection = factory.newConnection();

        return connection;

    }

}
