package com.dayone.controller;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static BasicDataSource getsource()
	{
	BasicDataSource bd=new BasicDataSource();
	bd.setDriverClassName("com.mysql.jdbc.Driver");
	bd.setUsername("root");
	bd.setPassword("root");
	bd.setUrl("jdbc:mysql://LocalHost:3306/krishna");
	return bd;
	
	}
	public static JdbcTemplate gettemplate()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getsource());
		return template;
	}
}
