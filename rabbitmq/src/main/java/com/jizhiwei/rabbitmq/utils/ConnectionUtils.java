package com.jizhiwei.rabbitmq.utils;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtils {

	public static Connection getConnection() throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("");
		factory.setPort(5672);
		factory.setVirtualHost("/jdb");
		factory.setUsername("jizhiwei");
		factory.setPassword("jizhiwei888");
		return factory.newConnection();
	}
}
