package com.jizhiwei.rabbitmq.simple;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.jizhiwei.rabbitmq.utils.ConnectionUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Send {
	private static String QUEUE_NAME = "test_simple_rabbitmq";

	public static void main(String[] str) throws IOException, TimeoutException {
		Connection connection = ConnectionUtils.getConnection();
		Channel channel = connection.createChannel();
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		String msgContent = "hello RabbitMq";
		channel.basicPublish("", QUEUE_NAME, null, msgContent.getBytes());

		channel.close();
		connection.close();
	}
}
