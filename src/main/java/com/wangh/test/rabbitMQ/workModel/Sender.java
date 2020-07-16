/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/4/8 17:48 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.rabbitMQ.workModel;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.wangh.test.rabbitMQ.ConnectionUtil;
import java.io.IOException;

/**
 * @author wangh
 * @create 2020/4/7
 * @since 1.0.0
 */
public class Sender {

    final static String QUEUE_NAME = "queue_work";

    public static void main(String[] args) throws IOException, InterruptedException {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        for (int i = 0; i < 100; i++) {
            String message = "王浩测试" + i;
            /**
             *这里没有指定交换机，消息将发送给默认交换机，每个队列也会绑定那个默认的交换机，但是不能显
             * 示绑定或解除绑定
             *默认的交换机，routingKey等于队列名称
             */
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("[x] Sent '" + message + "'");
            Thread.sleep(i * 10);
        }

        channel.close();
        connection.close();
    }

}
