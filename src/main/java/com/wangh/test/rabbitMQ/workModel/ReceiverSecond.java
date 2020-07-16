/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/4/8 17:14 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.rabbitMQ.workModel;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;
import com.wangh.test.rabbitMQ.ConnectionUtil;
import java.io.IOException;

/**
 * 接收类
 *
 * @author wangh
 * @create 2020/4/7
 * @since 1.0.0
 */
public class ReceiverSecond {


    public static void main(String[] args) throws IOException, InterruptedException {
        BaseReceiver receiver = new BaseReceiver();
        Channel channel = receiver.getChannel();
        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(BaseReceiver.QUEUE_NAME, false, consumer);
        while (true) {
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println("[x] Received2 '" + message + "'");
            Thread.sleep(1000);
            //返回确认状态
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(), true);
        }

    }

}
