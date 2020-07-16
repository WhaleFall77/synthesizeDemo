/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/4/8 17:13 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.rabbitMQ.easyModel;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;

/**
 * 发送类
 *
 * @author wangh
 * @create 2020/4/8
 * @since 1.0.0
 */
public class Send {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws IOException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello World!";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}
