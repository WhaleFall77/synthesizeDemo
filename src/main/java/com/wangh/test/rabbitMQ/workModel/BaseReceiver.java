/**
 * Copyright (C), 2015‐2020, 北京清能互联科技有限公司 Author:  gss Date:  2020/4/9 10:08 History:
 * <author> <time> <version> <desc>
 */
package com.wangh.test.rabbitMQ.workModel;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;
import com.wangh.test.rabbitMQ.ConnectionUtil;
import java.io.IOException;

/**
 * Description:  <br>
 *
 * @author wangh
 * @create 2020/4/7
 * @since 1.0.0
 */
public class BaseReceiver {

    public final static String QUEUE_NAME = "queue_work";

    public Channel getChannel() throws IOException {

        Connection connection = ConnectionUtil.getConnection();

        //创建与Exchange的通道，每个连接可以创建多个通道，每个通道代表一个会话任务channel = connection.createChannel();
        Channel channel = connection.createChannel();

        /**
         *声明队列，如果Rabbit中没有此队列将自动创建
         *param1:队列名称
         *param2:是否持久化
         *param3:队列是否独占此连接
         *param4:队列不再使用时是否自动删除此队列
         *param5:队列参数
         */
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        //通道channel每次能够接收的消费者最大值
        channel.basicQos(1);
        return channel;
    }

}
