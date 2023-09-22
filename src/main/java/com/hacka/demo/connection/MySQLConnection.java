package com.hacka.demo.connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {

	private static Connection conn = null;

	public static Connection getConnection() {
		Properties props = getProperties();
		String url = props.getProperty("dburl");
		try {
			conn = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;

	}

	private static Properties getProperties() {
		Properties props = new Properties();
		try (FileInputStream fs = new FileInputStream("mysql.properties")) {
			props.load(fs);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return props;

	}

}
