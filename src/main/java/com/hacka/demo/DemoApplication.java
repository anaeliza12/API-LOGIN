package com.hacka.demo;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hacka.demo.connection.MySQLConnection;
import com.mysql.cj.MysqlConnection;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Connection con = MySQLConnection.getConnection();
		System.out.println(con);
	}

}
