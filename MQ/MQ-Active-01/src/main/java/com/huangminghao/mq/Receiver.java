package com.huangminghao.mq;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @User:Mingaho
 * @Date:2021/11/24
 * @Time:16:30
 */


import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息接收
 */
public class Receiver {

    //1、获取接连工厂
    public static void main(String[] args) throws Exception {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnectionFactory.DEFAULT_USER,
                ActiveMQConnectionFactory.DEFAULT_PASSWORD,
                "tcp://localhost:61616"
        );


        //2、获取一个向ActiveMQ的连接
        Connection connection = connectionFactory.createConnection();
        connection.start();

        //3、获取session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);//是否需要事务， 确认方式

        //4、找到目的地，获取destination，消费端，也会从则合格目的地取消息
        Destination queue = session.createQueue("user");

        //5、获取消息
        MessageConsumer consumer = session.createConsumer(queue);

        while (true) {
            TextMessage message = (TextMessage)consumer.receive();//没有消息的话会阻塞
            System.out.println("message: " + message.getText());
        }
    }
}
