package com.jizhiwei.rabbitmq.simple;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.jizhiwei.rabbitmq.utils.ConnectionUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Recevie {
	public static void main(String[] args) throws IOException, TimeoutException {
		Connection connection = ConnectionUtils.getConnection();
		Channel channel = connection.createChannel();

	}
}
